package refactorizaciondam;

public class PersonaBase {
    protected String nombre;
    protected String dni;

    public PersonaBase(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void mostrarDatosBasicos() {
        System.out.println("Nombre: " + nombre + " | DNI: " + dni);
    }
}