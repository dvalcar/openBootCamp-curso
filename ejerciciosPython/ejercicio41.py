print("¿Cuál es tu edad?")
edad=input()
edad=int(edad)
if(edad>=18):
	print("Eres mayor de edad")
elif(0<=edad and edad<18):
	print("Eres menor de edad")
else:
	print("No es una edad valida")
