package org.example;
import java.util.ArrayList;
import java.util.List;


public class Incidencia {
        private String codincidencia;
        private String fechaApertura;
        private List<Usuario> listaUsuario;
        private List<Responsable> listaResponsable;
        private List<Categoria> listaCategoria;
        private String estado;

        public Incidencia(String codincidencia, String fechaApertura, List<Usuario> listaUsuario, List<Responsable> listaResponsable, List<Categoria> listaCategoria, String estado) {
            this.codincidencia = codincidencia;
            this.fechaApertura = fechaApertura;
            this.listaUsuario = new ArrayList<>();
            this.listaResponsable = new ArrayList<>();
            this.listaCategoria = new ArrayList<>();
            this.estado = estado;
        }

        public void agregarUsuario(Usuario usuario){
            this.listaUsuario.add(usuario);
        }

        public void agregarResposanble(Responsable responsable){
            this.listaResponsable.add(responsable);
        }
        public void agregarCategoria(Categoria categoria){
            this.listaCategoria.add(categoria);
        }

        public String getCodincidencia() {
            return codincidencia;
        }

        public void setCodincidencia(String codincidencia) {
            this.codincidencia = codincidencia;
        }

        public String getFechaApertura() {
            return fechaApertura;
        }

        public void setFechaApertura(String fechaApertura) {
            this.fechaApertura = fechaApertura;
        }

        public List<Usuario> getListaUsuario() {
            return listaUsuario;
        }

        public void setListaUsuario(List<Usuario> listaUsuario) {
            this.listaUsuario = listaUsuario;
        }

        public List<Responsable> getListaResponsable() {
            return listaResponsable;
        }

        public void setListaResponsable(List<Responsable> listaResponsable) {
            this.listaResponsable = listaResponsable;
        }

        public List<Categoria> getListaCategoria() {
            return listaCategoria;
        }

        public void setListaCategoria(List<Categoria> listaCategoria) {
            this.listaCategoria = listaCategoria;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        private int calcularValorPrioridad(Usuario cargo, Categoria tipoIncidente) {
            int valorPonderado = 0;
            valorPonderado = obtenerValorCargo(cargo)*obtenerValorIncidencia(tipoIncidente);
            if (valorPonderado >= 19) {
            return 1; // Prioridad 1
                } else if (valorPonderado >= 13 && valorPonderado <= 18) {
                return 2; // Prioridad 2
                    } else if (valorPonderado >= 7 && valorPonderado <= 12) {
                    return 3; // Prioridad 3
                        } else {
                        return 4; // Prioridad 4
                        }
            }

    //Metodo para calcular el valo del usuario segun su cargo/rol
    public int obtenerValorCargo(Usuario cargo){
        if (cargo.equals("Gerente")) {
            return 19;
        } else if (cargo.equals("Supervisor")) {
            return 4;
        } else if (cargo.equals("Analista/Asistente")) {
            return 3;
        } else if (cargo.equals("Practicante")) {
            return 2;
        } else {
            return 1;
        }
    }

    //Metodo para calcular el valor del incidente segun su tipo
    public int obtenerValorIncidencia(Categoria tipoIncidente) {
        if (tipoIncidente.equals("Soporte Tecnico")) {
            return 5;
        } else if (tipoIncidente.equals("Acceso a Sistemas")) {
            return 4;
        } else if (tipoIncidente.equals("Desbloqueo de Cuenta")) {
            return 3;
        } else if (tipoIncidente.equals("Instalación de software")) {
            return 2;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "codincidencia='" + codincidencia + '\'' +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", listaUsuario=" + listaUsuario +
                ", listaResponsable=" + listaResponsable +
                ", listaCategoria=" + listaCategoria +
                ", estado='" + estado + '\'' +
                //", la prioridad es='" + calcularValorPrioridad() + '\'' +
                '}';
    }
}
