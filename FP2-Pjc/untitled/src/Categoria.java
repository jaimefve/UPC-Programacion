public class Categoria {
    private String TipoIncidente;

    //Constructor
    public Categoria(String tipoIncidente) {
        TipoIncidente = tipoIncidente;
    }
    //Getter
    public String getTipoIncidente() {
        return TipoIncidente;
    }

    //toString
    @Override
    public String toString() {
        return "Categoria{" +
                "TipoIncidente='" + TipoIncidente + '\'' +
                '}';
    }

}
