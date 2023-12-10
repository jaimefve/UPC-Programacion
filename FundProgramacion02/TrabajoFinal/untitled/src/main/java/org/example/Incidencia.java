package org.example;

public class Incidencia {
    /// Atributos
    private String codIncidencia;
    private Categoria categoria;
    private String fecha;
    private String estado;
    private Usuario usuario;
    private Responsable responsable;


    ///Contructor
    public Incidencia(String codIncidencia, Categoria categoria, String fecha, String estado, Usuario usuario,Responsable responsable) {
        this.codIncidencia = codIncidencia;
        this.categoria = categoria;
        this.fecha = fecha;
        this.estado = estado;
        this.usuario = usuario;
        this.responsable = responsable;
    }

    ///Getter

    public String getCodIncidencia() {
        return codIncidencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Responsable getResponsable() {
        return responsable;
    }



    //Método para calcular el valor ponderado

    public int calcularValorPonderado(){
        int ValorPonderado=0;

        ValorPonderado= getUsuario().obtenerValorCargo()*(getCategoria().obtenerValorIncidencia());

        return ValorPonderado;
    }

    /// Método para calcular la prioridad

    private int calcularPrioridad() {
        if (calcularValorPonderado() >= 19 ) {
            return 1; // Prioridad 1
        } else if (calcularValorPonderado() >= 13 && calcularValorPonderado() <= 18) {
            return 2; // Prioridad 2
        } else if (calcularValorPonderado() >= 7 && calcularValorPonderado() <= 12) {
            return 3; // Prioridad 3
        } else {
            return 4; // Prioridad 4
        }
    }


    /// Método para calcular tiempo estimado para la atención

    private int calcularTiempoEstimado() {
        if (calcularPrioridad() == 1 ) {
            return 2; // Horas
        } else if (calcularPrioridad() == 2 ) {
            return 4; // Horas
        } else if (calcularPrioridad() == 3 ) {
            return 6; // Horas
        } else {
            return 12; // Horas
        }
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "codIncidencia='" + codIncidencia + '\'' +
                ", categoria=" + categoria +
                //", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                ", usuario=" + usuario +
                ", responsable=" + responsable +
                //", el valor ponderado es =" +calcularValorPonderado()+
                ", Prioridad =" + calcularPrioridad()+
                ", Tiempo estimado de atención =" + calcularTiempoEstimado()+
                '}';
    }
}
