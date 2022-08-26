class Stack:
    def __init__(self):
        self._content = []

    def empty(self):
        return not bool(len(self._content))

    def size(self):
        return len(self._content)

    def peek(self, offset=-1):
        return self._content[offset]

    def push(self, new):
        self._content.append(new)

    def pop(self):
        if not self.empty():
            return self._content.pop()

    def find(self, element, comparator=lambda internal, external: internal == external):
        # Go through it in reverse
        i = len(self._content)
        j = -1
        for _ in range(0, i):
            if bool(comparator(self._content[j], element)):
                return self._content[j]
        return None

    def get_content(self):
        return self._content
