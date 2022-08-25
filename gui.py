# # from tkinter import *
# # from turtle import bgcolor, width
# # from PIL import Image, ImageTk
# # from random import seed
# # from tkinter import filedialog
# # import numpy as np
# from antlr4 import *
# from antlr4.tree.Trees import Trees
# from antlr4.tree.Tree import TerminalNodeImpl
# from graphviz import Digraph

# from IO.Getters import CompilerComponents, getAllComponents


# def code_generation():
#     print(code_text.get("1.0", 'end-1c'))


# def browseFiles():
#     filename = filedialog.askopenfilename(initialdir="/",
#                                           title="Select a File",
#                                           filetypes=(("Text files",
#                                                       "*.txt*"),
#                                                      ("all files",
#                                                       "*.*")))

#     # Change label contents
#     label_file_explorer.configure(text="File: "+filename)


# root = Tk()
# canvas = Canvas(root, width=1200, height=800, bg='gray')
# canvas.grid(columnspan=5, rowspan=5)

# myLabel = Label(root, text='YAPL compiler', bg='gray')
# myLabel.grid(column=1, row=0)

# myLabel2 = Label(root, text='Write code', bg='gray')
# myLabel2.grid(column=0, row=1)
# myLabel3 = Label(root, text='Browse files', bg='gray')
# myLabel3.grid(column=2, row=1)


# code_text = Text(root, width=60, height=30)
# code_text.grid(column=0, row=2)
# label_file_explorer = Label(root,
#                             text="File Explorer",
#                             width=80, height=4,
#                             fg="blue")
# label_file_explorer.grid(column=2, row=2)

# button_explore = Button(root,
#                         text="Browse Files",
#                         command=browseFiles)
# button_explore.grid(column=2, row=3)

# generate_file = Button(
#     root, command=lambda: file_generation(), text='Generate from File')
# generate_file.grid(column=2, row=4)

# generate_code = Button(
#     root, command=lambda: code_generation(), text='Generate from Code')
# generate_code.grid(column=0, row=4)


# def main(argv):
#     components = CompilerComponents(input_stream=argv[1])
#     tree = components.Parser.program()
#     visitor = Visitor()


# root.mainloop()
