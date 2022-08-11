class Vehiculo:
    color= None
    ruedas: int=0
    puertas: int=0

    def set_color(self, color):
        self.color=color
    def get_color(self):
        return self.color

    def set_ruedas(self, ruedas):
        self.ruedas=ruedas
    def get_ruedas(self):
        return self.ruedas

    def set_puertas(self, puertas):
        self.puertas=puertas
    def get_puertas(self):
        return self.puertas
class Coche(Vehiculo):
    velocidad=0
    cilindrada=0

    def set_velocidad(self,velocidad):
        self.velocidad=velocidad
    def get_velocidad(self):
        return self.velocidad

    def set_cilindrada(self,cilindrada):
        self.cilindrada=cilindrada
    def get_cilindrada(self):
        return self.cilindrada


c=Coche()
c.set_color("verde")
c.set_ruedas(4)
c.set_puertas(5)
c.set_velocidad(200)
c.set_cilindrada(1200)


print("Color",c.get_color())
print("Número de ruedas", c.get_ruedas())
print("Número de puertas",c.get_puertas())
print("Velocidad máxima",c.get_velocidad())
print("Cilindrada",c.get_cilindrada())