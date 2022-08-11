import time
HORAFIN=19

def main():
    hora=time.localtime().tm_hour
    minutos=time.localtime().tm_min
    if(hora>=19):
        print("Hora de ir a casa")
    else:
        print('Quedan {} horas y {} minutos para ir a casa.'.format(HORAFIN-hora-1,60-minutos))


if __name__=='__main__' :
    main()