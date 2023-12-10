package org.example;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio_fabricacion;
    private String tipo_motor;

    private int tarifa_revision;
    private int calif_sistema_direccion;
    private int calif_sistema_frenos;
    private int calif_emision_gases;
    private int calif_emisiones_sonoras;
    //Constructor
    public Vehiculo(String placa, String marca, String modelo, int anio_fabricacion, String tipo_motor,
                    int calif_sistema_direccion, int calif_sistema_frenos, int calif_emision_gases,
                    int calif_emisiones_sonoras) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio_fabricacion = anio_fabricacion;
        this.tipo_motor = tipo_motor;
        this.calif_sistema_direccion = calif_sistema_direccion;
        this.calif_sistema_frenos = calif_sistema_frenos;
        this.calif_emision_gases = calif_emision_gases;
        this.calif_emisiones_sonoras = calif_emisiones_sonoras;
    }
    //Para firar la tarifa de revisión
    public void setTarifa_revision(int tarifa_revision) {
        this.tarifa_revision = tarifa_revision;
    }

    //Metodo para observer la calificación General
    public int obtener_calificacion_general() {
        return (this.calif_sistema_direccion + this.calif_sistema_frenos + this.calif_emision_gases + this.calif_emisiones_sonoras);
    }

    //Metodo para obtener resultado de revisión
    public String obtener_resultado_revision() {
        String resultado="";
        if (obtener_calificacion_general()>=14) {
            resultado= "Aprobado";
        } else if (obtener_calificacion_general()>=12){
            resultado= "observado";
        } else {
            resultado = "desaprobado";
        }
        return resultado;
    }

    //Listar los atributos de Vehiculo
    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio_fabricacion=" + anio_fabricacion +
                ", tipo_motor='" + tipo_motor + '\'' +
                ", tarifa_revision=" + tarifa_revision +
                ", calif_sistema_direccion=" + calif_sistema_direccion +
                ", calif_sistema_frenos=" + calif_sistema_frenos +
                ", calif_emision_gases=" + calif_emision_gases +
                ", calif_emisiones_sonoras=" + calif_emisiones_sonoras +
                '}';
    }
}
