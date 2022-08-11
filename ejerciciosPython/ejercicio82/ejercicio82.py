import pickle

class Vehiculo:
    numero_puertas:int
    color:str
    combustible:str

    def __init__(self, numero_puertas, color, combustible):
        self.numero_puertas=numero_puertas
        self.color=color
        self.combustible=combustible

def main():
    coche=Vehiculo(2,'verde', 'diesel')
    f=open('save.dat','wb')
    pickle.dump(coche,f)
    f.close()

    f=open('save.dat', 'rb')
    coche2=pickle.load(f)
    f.close()

    print(coche2.numero_puertas, coche2.color, coche2.combustible)

if __name__=='__main__':
    main()