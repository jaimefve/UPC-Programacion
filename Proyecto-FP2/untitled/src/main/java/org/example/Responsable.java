package org.example;

public class Responsable {
    private String codResponsable;
    private String noResponsable;
    private String cargo;

    public Responsable(String codResponsable, String noResponsable, String cargo) {
        this.codResponsable = codResponsable;
        this.noResponsable = noResponsable;
        this.cargo = cargo;
    }

    public String getCodResponsable() {
        return codResponsable;
    }

    public void setCodResponsable(String codResponsable) {
        this.codResponsable = codResponsable;
    }

    public String getNoResponsable() {
        return noResponsable;
    }

    public void setNoResponsable(String noResponsable) {
        this.noResponsable = noResponsable;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "codResponsable='" + codResponsable + '\'' +
                ", noResponsable='" + noResponsable + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
