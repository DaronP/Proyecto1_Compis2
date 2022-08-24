class _Line:
    def __init__(self, content, line_number):
        self.content = content
        self.length = len(content)
        self.line_number = line_number

    def has_content(self):
        return bool(self.length)


class File:
    @staticmethod
    def read(path: str):
        with open(path, 'r') as f:
            return File(f.read())

    def __init__(self, contents: str = "", path: str = ""):
        if path:
            with open(path, "r") as f:
                contents = f.read()
        lines = contents.splitlines()
        all_lines = [_Line(line_content, line_number)
                     for line_number, line_content in enumerate(lines)]

        self._raw: str = contents
        self._original_size = len(lines)
        self._lines: list[_Line] = list(
            filter(lambda line: line.has_content(), all_lines))
        self._actual_size = len(self._lines)

    def get_raw(self):
        return self._raw

    def get_original_size(self):
        return self._original_size

    def get_lines(self):
        return self._lines

    def get_size(self):
        return self._actual_size
