
def main():

    paises=input('Introduce países separados por ,')

    #Lo convertimos en lista
    paises=paises.split(',')
    #Eliminamos posibles espacios
    i=0
    cantidad_paises=len(paises)
    while i<cantidad_paises:
        paises[i]=paises[i].strip()
        i+=1
    print(paises)
    #Usamos set para eliminar los repetidos
    paises=sorted(list(set(paises)))
    print(', '.join(paises))

if __name__=='__main__':
    main()