package org.example;

public class Categoria {
    private String tipoIncidente;


    public Categoria(String tipoIncidente) {

        this.tipoIncidente = tipoIncidente;
    }

    public Categoria() {
    }

    public String getTipoIncidente() {
        return tipoIncidente;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "tipoIncidente='" + tipoIncidente + '\'' +
                 '}';
    }


}
