package org.example;

public class Ligero extends Vehiculo{
    private int calif_sistema_luces;

    //Constructor
    public Ligero(String placa, String marca, String modelo, int anio_fabricacion, String tipo_motor, int calif_sistema_direccion,
                  int calif_sistema_frenos, int calif_emision_gases, int calif_emisiones_sonoras, int calif_sistema_luces) {
        super(placa, marca, modelo, anio_fabricacion, tipo_motor, calif_sistema_direccion, calif_sistema_frenos, calif_emision_gases,
                calif_emisiones_sonoras);
        this.calif_sistema_luces = calif_sistema_luces;
        this.setTarifa_revision(80);

    }
    //Metodo para calificacion general - Polimorfismo


    @Override
    public int obtener_calificacion_general() {
        return super.obtener_calificacion_general() + this.calif_sistema_luces;
    }

    @Override
    public String toString() {
        return "Ligero{" +
                super.toString() +
                "calif_sistema_luces=" + calif_sistema_luces +
                '}';
    }
}
