package org.example;

public class Sala4D extends Sala {

    private String modeloSistemaAire;
    private String modeloMotorVibracion;

    public Sala4D(String codigo, String nombre, int capacidad, double precioBase, String modeloSistemaAire, String modeloMotorVibracion) {
        super(codigo, nombre, capacidad, precioBase);
        this.modeloSistemaAire = modeloSistemaAire;
        this.modeloMotorVibracion = modeloMotorVibracion;
    }

    public String getModeloSistemaAire() {
        return modeloSistemaAire;
    }

    public void setModeloSistemaAire(String modeloSistemaAire) {
        this.modeloSistemaAire = modeloSistemaAire;
    }

    public String getModeloMotorVibracion() {
        return modeloMotorVibracion;
    }

    public void setModeloMotorVibracion(String modeloMotorVibracion) {
        this.modeloMotorVibracion = modeloMotorVibracion;
    }

    public double obtenerPorcentajeAdicional() {
        if (modeloSistemaAire.equals("aire-max-300")) {
            if (modeloMotorVibracion.equals("vib-max-550")) {
                return 0.25;
            } else if (modeloMotorVibracion.equals("vib-max-450")) {
                return 0.22;
            } else if (modeloMotorVibracion.equals("vib-max-300")) {
                return 0.18;
            }
        } else if (modeloSistemaAire.equals("aire-max-250")) {
            if (modeloMotorVibracion.equals("vib-max-550")) {
                return 0.15;
            } else if (modeloMotorVibracion.equals("vib-max-450")) {
                return 0.13;
            } else if (modeloMotorVibracion.equals("vib-max-300")) {
                return 0.11;
            }
        } else if (modeloSistemaAire.equals("aire-max-100")) {
            if (modeloMotorVibracion.equals("vib-max-550")) {
                return 0.10;
            } else if (modeloMotorVibracion.equals("vib-max-450")) {
                return 0.08;
            } else if (modeloMotorVibracion.equals("vib-max-300")) {
                return 0.05;
            }
        }
        return 0;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() * (1 + obtenerPorcentajeAdicional());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Sala4D{" +
                "modeloSistemaAire='" + modeloSistemaAire + '\'' +
                ", modeloMotorVibracion='" + modeloMotorVibracion + '\'' +
                '}';
    }
}
