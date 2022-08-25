import pprint
import re

class SymTable:
    
    def __init__(self, id=0, ambito='global', struct=None, data_type=None, return_type=None, init_val=None, num_params=0, type_params=None):
        self.table = {'id': [], 'ambito':[], 'struct_type': [], 'data_type': [], 'size':[], 'offset': [], 'return_type': [], 'init_val': [], 'num_of_params': [], 'type_of_params': []}
        self.types = ['int', 'String', 'bool']

    def print_symbol(self):
        return [self.table['ID'], self.table['data_type'], self.table['ambito'], self.table['size'], self.table['offset']]

    def get_type(name, table):
        res = []
        for i in range(len(table)):
            if table[i]['id'] == name:
                res.append([table[i]['data_type'], name, table[i]['ambito']])
        return res
    
    def is_number(sym, text):
        for i in range(len(sym)):
            if sym[i]['name'] == text:
                return True
    
    def compare_symbols(sym1, sym2):
        c = 0
        for i in range(len(sym1)):
            if sym1[i]['id'] == sym2['id'] and sym1[i]['data_type'] == sym2['data_type'] and sym1[i]['ambito'] == sym2['ambito'] and sym1[i]['size'] == sym2['size']:
                c += 1
        
        if c < 1:
            return True
        else:
            return False
    
    def printing(sym):
        for i in range(len(sym)):
            print(sym[i]['id'], sym[i]['data_type'], sym[i]['ambito'], sym[i]['size'], sym[i]['offset'])


class Data_Types:
    def __init__(self, id=0, ambito='global', struct=None, data_type=None, return_type=None, init_val=None, num_params=0, type_params=None):
        self.table = {'id': [], 'ambito':[], 'struct_type': [], 'data_type': [], 'size':[], 'offset': [], 'return_type': [], 'init_val': [], 'num_of_params': [], 'type_of_params': []}
        self.types = ['int', 'String', 'bool']