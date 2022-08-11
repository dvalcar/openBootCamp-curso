public class Main {
    public static void main(String[] args) {
        int numeroIf=-2;
        if(numeroIf>0)
            System.out.println("Es positivo");
        else if (numeroIf<0) {
            System.out.println("Es negativo");
        }
        else
            System.out.println("Es 0");

        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile=0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile<1);

        for(int numeroFor=0; numeroFor<=3; numeroFor++)
            System.out.println(numeroFor);

        String estacion="PRIMAVERA";
        switch (estacion) {
            case ("INVIERNO"):
                System.out.println("Es invierno");
                break;
            case ("PRIMAVERA"):
                System.out.println("Es primavera");
                break;
            case ("OTOÑO"):
                System.out.println("Es otoño");
                break;
            case ("VERANO"):
                System.out.println("Es verano");
                break;
            default:
                System.out.println("No es una estacioón");
        }

    }
}