package org.example;

public class Alumno {
    private int codigo;

    public Alumno(int codigo, String nombre, String apellido, int pc1, int pc2, int pc3, int ep, int ef) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ep = ep;
        this.ef = ef;
    }

    private String nombre;
    private String apellido;
    private int pc1;
    private int pc2;
    private int pc3;

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    private int ep;
    private int ef;

    public double calcularPromedio() {
        double promedioPracticas = (pc1 + pc2 + pc3) / 3.0;
        return (promedioPracticas*0.2 + ep*0.3 + ef*0.5);
    }
    public double getPromedioFinal(){
        return calcularPromedio();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pc1=" + pc1 +
                ", pc2=" + pc2 +
                ", pc3=" + pc3 +
                ", ep=" + ep +
                ", ef=" + ef +
                '}';
    }
}
