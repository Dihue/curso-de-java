package Laboratorio.Clases.C11_10.PracticaExamen;

public class Activo {
    private String nombre;
    private double monto;

    public Activo(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Monto: $ " + monto;
    }
}
