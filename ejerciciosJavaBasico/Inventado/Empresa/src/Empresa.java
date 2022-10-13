import java.io.*;
import java.util.*;

public class Empresa {
    private int identificador = 0;
    private HashMap<Integer, Empleado> empleados = new HashMap<Integer, Empleado>();

    public void crearEmpleado() {
        System.out.println("Indicar nombre:");
        Scanner scanner = new Scanner(System.in);
        try {
            String nombre = scanner.next();
            boolean noInt = false;
            do {
                try {
                    Scanner scannerEdad = new Scanner(System.in);
                    System.out.println("Indicar edad:");
                    int edad = scannerEdad.nextInt();
                    empleados.put(identificador, new Empleado(nombre, edad));//crear empleado
                    System.out.println("Empleado con id: " + identificador + " añadido.");
                    identificador++;//El proximo empleado tendrá un id más
                    noInt = false;
                } catch (InputMismatchException e) {
                    noInt = true;
                    System.out.println("Edad debe ser un número entero.");
                }
            } while (noInt);
        }catch (Exception e) {
            System.out.println("Fallo al leer el nombre.");
        }
    }

    public void mostrarVentasEmpleado(int id) {
        Empleado empleado = empleados.get(id);
        if (empleado == null) {
            System.out.println("Empleado con id: " + id + " no encontrado.");
        } else {
            System.out.println(empleado.getVentas());
        }
    }

    public void addVentas(int id, Integer importe) {
        Empleado empleado = empleados.get(id);
        if (empleado == null) {
            System.out.println("Empleado con id: " + id + " no encontrado.");
        } else {
            empleado.setVentas(importe);
        }
    }

    public void guardar() throws FileNotFoundException {
        PrintStream ps = new PrintStream("empresa.txt");
        for (int i = 0; i < empleados.size(); i++) {
            ps.println(empleados.get(i).getName());
            ps.println(empleados.get(i).getEdad());
            for (int j = 0; j < empleados.get(i).getVentas().size(); j++) {
                ps.println(empleados.get(i).getVentas().get(j));
            }
            ps.println("@-@");//String de control para saber cuando se cambia de empleado
        }
        ps.close();
    }

    public Empresa leer() throws IOException {
        Empresa empresa = new Empresa();
        try {
            InputStream in = new FileInputStream("empresa.txt");
            Scanner scanner = new Scanner(in);
            boolean noEnd = true;
            do {
                try {
                    String nombre = scanner.next();
                    try {
                        int edad = scanner.nextInt();

                        empresa.empleados.put(empresa.identificador, new Empleado(nombre, edad));

                        String ventas = scanner.next();
                        try {
                            while (!Objects.equals(ventas, "@-@")) {
                                int venta = Integer.parseInt(ventas);
                                empresa.addVentas(empresa.identificador, venta);
                                ventas = scanner.next();
                            }
                            empresa.identificador++;
                        }catch(NumberFormatException e){
                            System.out.println("Fallo al leer el fichero. Fallo al convertir a número entero.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Fallo al leer el fichero. Se esperaba un número entero.");
                    }
                } catch (NoSuchElementException e) {
                    noEnd = false;
                }
            } while (noEnd);

        } catch (FileNotFoundException e) {
            System.out.println("Inicializando primera ejecución...");
        }
        return empresa;
    }
}
