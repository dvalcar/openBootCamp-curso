class Coche{
    int puertas=0;

    Coche(){};
    void AddPuertas(){
        puertas++;
    }

    void MostrarPuerta(){
        System.out.println(puertas);
    }


}
public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado=suma(1,2,3);
        System.out.println(resultado);

        Coche miCoche;
        miCoche=new Coche();
        miCoche.AddPuertas();
        miCoche.MostrarPuerta();
    }

    public static int suma(int a, int b, int c){
        return(a+b+c);
    }

}