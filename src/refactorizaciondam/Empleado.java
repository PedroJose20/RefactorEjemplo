package refactorizaciondam;

public class Empleado extends PersonaBase implements Trabajable {
    protected int codEmpleado;
    protected double salarioBase;

    public Empleado(String nombre, String dni, int idEmpleado, double salarioBase) {
        super(nombre, dni);
        this.codEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    public void ficharEntrada(int hora, int minuto){
        System.out.println(nombre + " ha fichado su entrada a las " + hora + ":" + minuto);
    }

    public void mostrarResumen() {
        System.out.println("Empleado: " + nombre + " | ID: " + codEmpleado + " | Salario: " + calcularSalario());
    }

}