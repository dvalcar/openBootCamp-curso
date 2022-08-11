class Alumno:
    def __init__(self,nombre,nota):
        self.nombre=nombre
        self.nota=nota

    def imprimir_alumno(self):
        print( "Nombre: {} - Nota: {}".format(self.nombre, self.nota))

    def mostrar_nota(self):
        print("La nota de {} es {}".format(self.nombre, self.nota))
        if(self.nota>=5):
            print("Ha aprobado")
        else:
            print("Ha suspendido")

nombre=input("Nombre del alumno")
nota=-1
while(nota<0):
    nota=int(input("Nota del alumno"))
    if(nota<0):
        print("La nota no puede ser negativa")

alumno= Alumno(nombre,nota)
alumno.imprimir_alumno()
alumno.mostrar_nota()

