public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        cliente.setCredito(1000);
        cliente.setEdad(20);
        cliente.setNombre("Paco");
        cliente.setTelefono("666 333 666");

        Trabajador trabajador=new Trabajador();
        trabajador.setSalario(20000);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
        System.out.println(trabajador.getSalario());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
}
class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}