package org.example;

public class Auto extends Vehiculo{
    private String maletera;
    private String parabrisa;
    private String plumillas;

    public int getPuertas() {
        return puertas;
    }

    private int puertas;

    public Auto(String placa, String marca, String modelo, String maletera, String parabrisa, String plumillas, int puertas) {
        super(placa, marca, modelo);
        this.maletera = maletera;
        this.parabrisa = parabrisa;
        this.plumillas = plumillas;
        this.puertas = puertas;
    }

    public Auto(String maletera, String parabrisa, String plumillas, int puertas) {
        this.maletera = maletera;
        this.parabrisa = parabrisa;
        this.plumillas = plumillas;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Placa='" + super.getPlaca() + '\'' +
                ",Marca='" + super.getMarca() + '\'' +
                ",Modelo='" + super.getModelo() + '\'' +
                ",maletera='" + this.maletera + '\'' +
                ", parabrisa='" + this.parabrisa + '\'' +
                ", plumillas='" + this.plumillas + '\'' +
                ", puertas=" + this.puertas +
                '}';
    }
    //Metodo para calcular el tipo de puertas
    public void calcularTipoVehiculo(int nroPuertas) {

        if (nroPuertas>4) {
            System.out.println("ES un Hatchback");
        } else {
            System.out.println("Sedan");
        }
    }

    public void calcularTipoVehiculosConGett() {

        if (this.puertas>4) {
            System.out.println("ES un Hatchback");
        } else {
            System.out.println("Sedan");
        }
    }
}
