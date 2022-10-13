import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        int opcion = 0;
        int id;
        try {
            empresa = empresa.leer();
            do {
                try {
                    opcion = mostrarMenu();
                    switch (opcion) {
                        case 1 -> empresa.crearEmpleado();
                        case 2 -> {
                            boolean noInt;
                            do {
                                try {
                                    System.out.println("Teclee importe venta.");
                                    Scanner scanner = new Scanner(System.in);
                                    int importe = scanner.nextInt();
                                    try {
                                        System.out.println("Teclee id empleado");
                                        id = scanner.nextInt();
                                        empresa.addVentas(id, importe);
                                        noInt = false;
                                    } catch (InputMismatchException e) {
                                        noInt = true;
                                        System.out.println("ID no valido.");
                                    }
                                } catch (InputMismatchException e) {
                                    noInt = true;
                                    System.out.println("Teclee un número entero.");
                                }
                            } while (noInt);
                        }
                        case 3 -> {
                            System.out.println("Teclee id empleado");
                            Scanner scanner2 = new Scanner(System.in);
                            try {
                                id = scanner2.nextInt();
                                empresa.mostrarVentasEmpleado(id);
                            } catch (InputMismatchException e) {
                                System.out.println("Teclee un número entero.");
                            }
                        }
                        case 4 -> {
                            System.out.println("Guardando datos.");
                            try {
                                empresa.guardar();
                            } catch (FileNotFoundException e) {
                                System.out.println("Fallo al guardar los datos.");
                            }
                        }
                        default -> System.out.println("Seleccione una opcion de 1 a 4.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Opción no correcta, seleccione de 1 a 4.");
                }
            } while (opcion != 4);
        }catch (IOException e) {
            System.out.println("Fallo al recuperar los datos.");
        }
    }


    public static int mostrarMenu() {
        System.out.println("1-Añadir empleado.");
        System.out.println("2-Añadir venta.");
        System.out.println("3-Mostar ventas.");
        System.out.println("4-Salir");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}