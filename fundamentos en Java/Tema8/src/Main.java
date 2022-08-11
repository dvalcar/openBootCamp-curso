public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setEdad(20);
        persona.setNombre("Dani");
        persona.setTelefono("666333666");
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());


    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarEdad(){
        System.out.println(this.edad);
    }

    public void mostrarNombre(){
        System.out.println(this.nombre);
    }

    public void mostrarTelefono(){
        System.out.println(this.telefono);
    }
}