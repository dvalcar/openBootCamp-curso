import operaciones as o

def main():
    a=float(input("Introduce primer operando"))
    b=float(input("Introduce primer operando"))
    op=o.Operaciones()
    print('{}+{}={}'.format(a,b,op.suma(a,b)))
    print('{}-{}={}'.format(a,b,op.resta(a,b)))
    print('{}*{}={}'.format(a,b,op.multi(a,b)))
    print('{}/{}={}'.format(a,b,op.divi(a,b)))


if __name__=='__main__':
    main()