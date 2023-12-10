public class Responsable {
    private String CoResponsable;
    private String NoResponsable;
    private String CargoResp;

    //Constructor
    public Responsable(String coResponsable, String noResponsable, String cargoResp) {
        CoResponsable = coResponsable;
        NoResponsable = noResponsable;
        CargoResp = cargoResp;
    }

    // Getter
    public String getCoResponsable() { return CoResponsable; }
    public String getNoResponsable() { return NoResponsable; }
    public String getCargoResp() { return CargoResp; }

    //ToString
    @Override
    public String toString() {
        return "Responsable{" +
                "CoResponsable='" + CoResponsable + '\'' +
                ", NoResponsable='" + NoResponsable + '\'' +
                ", CargoResp='" + CargoResp + '\'' +
                '}';
    }
}
