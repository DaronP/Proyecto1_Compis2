from Structs.Table import Parameter, Scope, ScopeStack
from antlr_out.COOLParser import COOLParser


class MethodContextHelper:
    def __init__(self, name, scope, return_type, body, line, parameters) -> None:
        self.name = name
        self.scope = scope
        self.return_type = return_type
        self.body = body
        self.line = line
        self.parameters = parameters

    def is_return_type(self, return_type=''):
        return self.return_type == return_type


def get_info(ctx: COOLParser.MethodContext, scope_stack: ScopeStack) -> MethodContextHelper:
    id = ctx.OBJECTID().getText()
    scope = scope_stack.get_scope()
    return_type = ctx.TYPEID().getText()
    block = ctx.expression().getText()
    in_line = ctx.start.line
    parameters: list(Parameter) = []
    return MethodContextHelper(id, scope, return_type, block, in_line, parameters)


def fix_scope(scope_stack: ScopeStack, scope_fix: Scope):
    last_scope = scope_stack.get_scope()
    if last_scope.type == 'method':
        scope_stack.pop_scope()
    scope_stack.push_scope(scope_fix)


def get_parameters(ctx: COOLParser.MethodContext, save_in):
    params = []
    for i in ctx.formal():
        name, param_type = i.getText().split(':')
        new_param = Parameter(name=name, param_type=param_type)
        params.append(new_param)

    if save_in:
        save_in.extend(params.copy())
    return params


def find_duplicate_parameters(in_list, in_scope, in_line) -> bool:
    '''
    Returns two values:
    true if there are duplicate parameters, false otherwise
    and an error list or None
    '''
    newlist: list(Parameter) = []
    duplist: list(Parameter) = []
    errors: list(str) = []
    for param in in_list:
        if param not in newlist:
            newlist.append(param)
        else:
            duplist.append(param)

    if duplist:
        errors.extend(['A method parameter >> {} << is repeated inside the method >> {} << from the >> {} << class,  (line {})'.format(
            dup.get_name(),
            id,
            in_scope,
            in_line
        ) for dup in duplist])
    return bool(errors), errors if errors else None
