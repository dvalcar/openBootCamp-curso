import math


def AreaTriangulo(altura, base):
    if(altura >=0 and base>=0):
        return (altura * base) / 2
    else:
        return -1


def AreaCirculo(radio):
    if(radio>=0):
        return (math.pi * radio**2)
    else:
        return -1

areaTriangulo=AreaTriangulo(2,4)
if(areaTriangulo<0):
    print("Los números proporcionados no pueden ser negativos")
else:
    print(areaTriangulo)

areaCirculo=AreaCirculo(2)
if(areaCirculo<=0):
    print("El radio no puede ser negativo")
else:
    print(areaCirculo)