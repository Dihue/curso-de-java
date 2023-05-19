package Laboratorio.Clases.Segundo_Parcial;

public class Activo {
    private String nombre;
    private double monto;
    private String tipo;
    // Tipo de activo: Accion, Mueble, Inmueble


    public Activo(String nombre, double monto, String tipo) {
        this.nombre = nombre;
        this.monto = monto;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
