import tkinter

def main():
    lista=['Primero', 'Segunda', 'Tercero', 'Cuarto']

    root=tkinter.Tk()
    tkinter.Listbox(root, listvariable=tkinter.StringVar(value=lista)).pack()

    tkinter.Label(root, text='Texto de prueba').pack()
    root.mainloop()

if __name__=='__main__':
    main()