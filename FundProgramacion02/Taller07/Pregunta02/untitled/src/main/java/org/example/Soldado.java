package org.example;

public class Soldado implements InterfazAtaque {

    private String nombre;
    private int grado;

    public Soldado(String nombre, int grado) throws GradoInvalidoExcepcion {
        if (grado > 9 || grado < 0) {
            throw new GradoInvalidoExcepcion();
        }
        this.nombre = nombre;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String atacar() {
        return "piu";
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "nombre='" + nombre + '\'' +
                ", grado=" + grado +
                ", ataque= " + atacar() +
                '}';
    }
}
