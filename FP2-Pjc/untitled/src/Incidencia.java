public class Incidencia {
    private String codIncidencia;
    private Categoria categoria;
    private String fecha;
    private String estado;
    private Usuario usuario;
    private Responsable responsable;

    public Incidencia(String codIncidencia, Categoria categoria, String fecha, String estado, Usuario usuario, Responsable responsable) {
        this.codIncidencia = codIncidencia;
        this.categoria = categoria;
        this.fecha = fecha;
        this.estado = estado;
        this.usuario = usuario;
        this.responsable = responsable;
    }

    public String getCodIncidencia() { return codIncidencia; }
    public Categoria getCategoria() { return categoria; }
    public String getFecha() { return fecha; }
    public String getEstado() { return estado; }
    public Usuario getUsuario() { return usuario; }

    public Responsable getResponsable() { return responsable; }

    @Override
    public String toString() {
        return "Incidencia{" +
                "codIncidencia='" + codIncidencia + '\'' +
                ", categoria=" + categoria +
                ", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                ", usuario=" + usuario +
                ", responsable=" + responsable +
                '}';
    }
}

