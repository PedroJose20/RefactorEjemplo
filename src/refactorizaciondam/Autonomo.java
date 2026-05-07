package refactorizaciondam;

public class Autonomo extends PersonaBase implements Trabajable {
    private String nif;
    public double cotizacion;
    private double ingresoMensual;

    public Autonomo(String nombre, String dni, String nif, double cotizacion, double ingresoMensual) {
        super(nombre, dni);
        this.nif = nif;
        this.cotizacion = cotizacion;
        this.ingresoMensual = ingresoMensual;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(double cotizacion) {
        this.cotizacion = cotizacion;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    @Override
    public double calcularSalario() {
        return this.ingresoMensual - this.cotizacion;
    }
}
