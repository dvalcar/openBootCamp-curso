import sys
from functools import reduce
def esImpar(x):
    numero=int(x)
    if numero%2!=0:
        return True
    else:
        return False

def suma (a,b):
    x=int(a)
    y=int(b)
    return x+y

def main():
#Comprobamos que nos han pasado una lista de números
    cantidad_numeros=len(sys.argv)
#Quitamos el primer elemento que es el nombre del script, en este caso ejercicio92.py
    sys.argv.pop(0)
    if cantidad_numeros>1:
        print(reduce(suma,list(filter(esImpar, sys.argv))))
    else:
        print('Indica una lista de números')

if __name__=='__main__':
    main()


