import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String alreves=reverse("hola");
        System.out.println(alreves);

        String[] arrayUni={"Paco","Pedro","Dani"};
        for (String nombre:arrayUni){
            System.out.println(nombre);
        }

        int[][] arrayBidi={{1,2,3,4,5,6,7,8} , {10,11,12,13,14,15,16,17}};
        for (int i=0;i<arrayBidi.length;i++){
            for (int j=0;j<arrayBidi[1].length; j++){
                System.out.println("Elemento " + i + " " + j + "= " + arrayBidi[i][j]);
            }
        }

        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(1);//Borra el segundo elemento
        vector.remove(1);//Borra el tercer elemento que ahora es el segundo
        System.out.println(vector);

        /*
        El problema de utilizar un vector con la capacidad por defecto si tenemos 1000 elementos para ser añadidos
        es que va a producir muchas operaciones en disco al tener que multiplicarse por dos constantemente hasta llegar
        a los 1000 elementos.
         */

        ArrayList<String> lista= new ArrayList<String>();
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pedro");
        lista.add("Dani");
        LinkedList<String> linkedLista = new LinkedList<String>();
        //También podríamos usar un for para copiar
        linkedLista.addAll(lista);
        for(String s : linkedLista) {
            System.out.println(s);
        }
        for(String s : lista) {
            System.out.println(s);
        }

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        for(int i = 1; i < 11; i++) {
            listaNumeros.add(i);
        }
        for(int i = 0; i < listaNumeros.size(); i++) {
            if(listaNumeros.get(i)%2==0){
                listaNumeros.remove(i);
                //Al eliminar la posición i hay que revisar la nueva posicion i
                i--;

            }else {
                System.out.println(listaNumeros.get(i));
            }
        }

        try{
            DividePorCero();
        }catch(ArithmeticException e){
            System.out.println("Esto no se puede hacer");
        }finally {
            System.out.println("Demo de codigo");
        }

        try {
            InputStream fileIn = new FileInputStream("/etc/passwd");
            try {
                PrintStream fileOut = new PrintStream("destino.txt");
                try {
                    CopiaFichero(fileIn, fileOut);
                }catch (IOException e) {
                    System.out.println("Error al copiar el fichero");
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se puede crear el fichero destino");
            }
        } catch (FileNotFoundException e){
            System.out.println("No se encuentra el fichero origen");
        }
    }
    public static String reverse(String texto) {
        char[] arrayIn = texto.toCharArray();
        String textoInvertido="";
        for (int i = arrayIn.length-1; i > -1; i--){
            textoInvertido +=arrayIn[i];
        }
        return textoInvertido;
    }
    public static void DividePorCero() throws ArithmeticException{
        try{
            int a=2;
            a/=0;
        }catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    public static void CopiaFichero(InputStream fileIn, PrintStream fileOut) throws IOException {
        try{
            byte[] datos= fileIn.readAllBytes();
            try {
                fileIn.close();
                try {
                    fileOut.write(datos);
                    fileOut.close();
                }catch (IOException e){
                    System.out.println("Error al escribir en el fichero destino");
                    throw new IOException();
                }
            }catch (IOException e){
                System.out.println("Error al cerrar el fichero origen");
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
            throw new IOException();
        }
    }
}