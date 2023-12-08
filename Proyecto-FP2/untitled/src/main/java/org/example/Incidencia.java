package org.example;


import java.util.Date;
import java.util.List;

public class Incidencia extends Categoria{
    private int codigo;
    private String fecha;
    private String estado;
    private List<Usuario> listaUsuario;
    private List<Responsable> listaResponsable;

    public Incidencia(String tipoIncidente, int codigo, String fecha, String estado, List<Usuario> listaUsuario, List<Responsable> listaResponsable) {
        super(tipoIncidente);
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.listaUsuario = listaUsuario;
        this.listaResponsable = listaResponsable;
    }

    public Incidencia(int codigo, String fecha, String estado, List<Usuario> listaUsuario, List<Responsable> listaResponsable) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.listaUsuario = listaUsuario;
        this.listaResponsable = listaResponsable;
    }


}






