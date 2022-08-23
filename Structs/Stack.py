class Stack:
    _content = []

    def __init__(self):
        pass

    def empty(self):
        return bool(len(self._content))

    def size(self):
        return len(self._content)

    def peek(self):
        return self._content[-1]

    def push(self, new):
        self._content.append(new)

    def pop(self):
        return self._content.pop()

    def find(self, element, comparator=lambda internal, external: internal == external):
        # Go through it in reverse
        i = len(self._content)
        j = -1
        for _ in range(0, i):
            if bool(comparator(self._content[j], element)):
                return self._content[j]
        return None
