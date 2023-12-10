package org.example;

public class Categoria {
    /// Atributos
    private String TipoIncidente;


    ///Contructor
    public Categoria(String tipoIncidente) {
        TipoIncidente = tipoIncidente;
    }

    ///Getter

    public String getTipoIncidente() {
        return TipoIncidente;
    }


    // Método para obtener valor del incidente
    public int obtenerValorIncidencia() {

        if (TipoIncidente.equals("Soporte Tecnico")) {
            return 5;
        } else if (TipoIncidente.equals("Acceso a Sistemas")) {
            return 4;
        } else if (TipoIncidente.equals("Desbloqueo de Cuenta")) {
            return 3;
        } else if (TipoIncidente.equals("Instalación de software")) {
            return 2;
        } else {
            return 1;
        }

    }


    @Override
    public String toString() {
        return "Categoria{" +
                "TipoIncidente='" + TipoIncidente + '\'' +
                //"el valor del incidente es ='" + obtenerValorIncidencia() + '\'' +
                '}';
    }
}
