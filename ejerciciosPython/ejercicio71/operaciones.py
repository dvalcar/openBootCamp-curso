class Operaciones:
    def suma(self, a, b):
        return a+b
    def resta(self,a,b):
        return a-b
    def multi(self,a,b):
        return a*b
    def divi(self,a,b):
        if(b!=0):
            return a/b
        else:
            if(a>=0):
                return ("Infinito")
            else:
                return ("Infinito negativo")
