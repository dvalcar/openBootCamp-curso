def anio_bisiesto(anio: int) ->bool:
    if(anio%4==0 and anio%100!=0 or anio%400==0):
        return True
    else:
        return False

if(anio_bisiesto(1700)):
    print("Es un año bisiesto")
else:
    print("No es un año bisiesto")
