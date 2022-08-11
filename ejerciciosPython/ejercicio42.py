numero_inicial=input("Número inicial")
numero_inicial=int(numero_inicial)
numero_final=input("Número final")
numero_final=int(numero_final)
if(numero_inicial>numero_final):
	print("El número inicial es mayor que el final")
while(numero_inicial<=numero_final):
	if(numero_inicial%2!=0):
		print(numero_inicial)
	numero_inicial+=1
