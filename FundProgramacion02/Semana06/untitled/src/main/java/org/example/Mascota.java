package org.example;

public class Mascota {
    private String documento;
    private String nombres;
    private int edad;
    private Historial historial;

    public Mascota(String documento, String nombres, int edad) {
        this.documento = documento;
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public Historial getHistorial() {
        return historial;
    }

    //Asingar Historial
    public void asignarHistorial(Historial historial) {
        this.historial = historial;
    }

    public String obtenerPrioridad() {
        //
        if (historial.calcularMontoTotal()>3000) {
            return "Alta";
        } else if (historial.calcularMontoTotal()>=1000 && historial.calcularMontoTotal()<=3000) {
            return "Media";
        } else if (historial.calcularMontoTotal()<1000) {
            return "Baja";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", edad=" + edad +
                ", historial=" + historial +
                "prioridad = " + obtenerPrioridad() +
                '}';
    }
}
