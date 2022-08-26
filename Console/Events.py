# from enum import Enum, auto


# Level = 3
# Incoming = INFO -> 3
# Level._LEVEL > incoming.value
# 3 > 0 == True
# Level = 1
# Level._LEVEL > incoming.value == False

# class Level(Enum):
#     FATAL = 0
#     ERROR = 1
#     WARNING = 2
#     INFO = 3

#     _LEVEL = 3

#     @staticmethod
#     def set_logging_level(new_level):
#         if not isinstance(new_level, Level):
#             raise "Not setting Level to listen to something"
#         Level._LEVEL = new_level

#     @staticmethod
#     def is_type(incoming, is_of_type) -> bool:
#         if not isinstance(is_of_type, Level) or not isinstance(incoming, Level):
#             raise "Faulty comparison"
#         return incoming.value == is_of_type.value

#     @staticmethod
#     def is_allowed(incoming):
#         return Level._LEVEL > incoming.value


# class Console:
#     _LOGGING = True

#     @staticmethod
#     def toggle_logging(to=None):
#         if to is None:
#             Console._LOGGING = not Console._LOGGING
#         else:
#             Console._LOGGING = to

#     @staticmethod
#     def emit(event_type: Level, message):
#         if not Console._LOGGING:
#             return

#         if Level.is_allowed(event_type):
#             return

#         if Level.is_type(event_type, Level.INFO):
#             print(f"\033[94m[\t{event_type.name}\t]\033[0m{message}")
#         elif Level.is_type(event_type, Level.WARNING):
#             print(f"\033[93m[\t{event_type.name}\t]\033[0m{message}")
#         elif Level.is_type(event_type, Level.ERROR):
#             print(f"\033[91m[\t{event_type.name}\t]\033[0m{message}")
#         elif Level.is_type(event_type, Level.FATAL):
#             print(f"\033[91m[\t{event_type.name}\t]\033[0m{message}")
