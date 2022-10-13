import java.util.LinkedList;

public class Empleado {
    private LinkedList<Integer> ventas  = new LinkedList<Integer>();
    private String name = "";
    private int edad=0;

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Empleado(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public void setVentas(Integer venta) {

        this.ventas.add(venta);
    }
    public LinkedList<Integer> getVentas() {

        return ventas;
    }

}

