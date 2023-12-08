package org.example;

public class Responsable {


    /// Atributos

    private String CoResponsable;

    private String NoResponsable;

    private String CargoResp;


    ///Constructor


    public Responsable(String coResponsable, String noResponsable, String cargoResp) {
        CoResponsable = coResponsable;
        NoResponsable = noResponsable;
        CargoResp = cargoResp;
    }



    ///Getter


    public String getCoResponsable() {
        return CoResponsable;
    }

    public String getNoResponsable() {
        return NoResponsable;
    }

    public String getCargoResp() {
        return CargoResp;
    }



    @Override
    public String toString() {
        return "Responsable{" +
                "CoResponsable='" + CoResponsable + '\'' +
                //", NoResponsable='" + NoResponsable + '\'' +
                ", CargoResp='" + CargoResp + '\'' +
                '}';
    }
}
