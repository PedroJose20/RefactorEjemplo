package refactorizaciondam;

public class AdministradorSistemas extends Empleado {
    private int numeroServidores;
    private boolean guardia;

    public AdministradorSistemas(String nombre, String dni, int idEmpleado, double salarioBase, int numeroServidores, boolean guardia) {
        super(nombre, dni, idEmpleado, salarioBase);
        this.numeroServidores = numeroServidores;
        this.guardia = guardia;
    }

    public int getNumeroServidores() {
        return numeroServidores;
    }

    public boolean isGuardia() {
        return guardia;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (numeroServidores * 15) + (guardia ? 100 : 0);
    }

    public void administrarRed() {
        System.out.println(nombre + " está administrando " + numeroServidores + " servidores");
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Administrador: " + nombre + " | Servidores: " + numeroServidores +
                " | Salario: " + calcularSalario());
    }

    public void realizarTareaTecnica(){
        System.out.println(nombre + " está realizando una tarea técnica");
    }
}