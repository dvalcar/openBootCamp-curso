import math

#Usamos el Teorema de Wilson
def numero_primo(numero: int)->bool:
    if(numero>1):
        return not bool((math.factorial(numero-1)+1)%numero)
    else:
        print("Los numeros primos son mayores que 1")
        return False

if(numero_primo(2)==True):
    print("Es un número primo")
else:
    print("No es un número primo")
