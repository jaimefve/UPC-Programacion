package org.example;

public abstract class Sala {

    private String codigo;
    private String nombre;
    private int capacidad;
    private double precioBase;

    public Sala(String codigo, String nombre, int capacidad, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecio();

    public double calcularVentaTotal() {
        return calcularPrecio() * capacidad;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", precioBase=" + precioBase +
                ", calcularPrecio=" + calcularPrecio() +
                ", ventaTotal=" + calcularVentaTotal() +
                '}';
    }
}

