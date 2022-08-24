import os
from File import File


class Environment:
    @staticmethod
    def getEnvVars(env_content: str) -> dict:
        contents = File(contents=env_content).get_lines()
        tuple_values = [tuple(line.content.split('=', 1)) for line in contents]
        return dict(tuple_values)


if __name__ == '__main__':
    current_path = os.path.join(os.getcwd(), '.env')
    vars = Environment.getEnvVars("PATH=Some path")
    print(vars)
