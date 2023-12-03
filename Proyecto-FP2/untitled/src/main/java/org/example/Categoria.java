package org.example;

public class Categoria {
    private String tipoIncidente;

    public Categoria(String tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    public String getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(String tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "tipoIncidente='" + tipoIncidente + '\'' +
                '}';
    }


}
