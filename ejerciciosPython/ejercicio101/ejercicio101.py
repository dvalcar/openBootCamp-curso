import tkinter
from tkinter import ttk

def main():
    def reiniciar(event):
        seleccionado.set('')

    window=tkinter.Tk()
    window.columnconfigure(0, weight=1)
    window.columnconfigure(1, weight=4)

    seleccionado = tkinter.StringVar()
    opcion1 = ttk.Radiobutton(window, text='Opción1', value='Opción1', variable=seleccionado)
    opcion2 = ttk.Radiobutton(window, text='Opción2', value='Opción2', variable=seleccionado)
    opcion3 = ttk.Radiobutton(window, text='Opción3', value='Opción3', variable=seleccionado)

    opcion1.grid(column=0, row=0, padx=5, pady=5)
    opcion2.grid(column=0, row=1, padx=5, pady=5)
    opcion3.grid(column=0, row=2, padx=5, pady=5)

    mensaje=tkinter.Label(window, textvariable=seleccionado)
    mensaje.grid(column=0, row=3, padx=0, pady=0)


    boton_reiniciar=ttk.Button(window, text='Reiniciar')
    boton_reiniciar.grid(column=0, row=4, padx=5, pady=5)
    boton_reiniciar.bind('<Button-1>', reiniciar)

    window.mainloop()

if __name__=='__main__':
    main()