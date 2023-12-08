package org.example;

public class Usuario {

    /// Atributos
    private String codUsuario;
    private String noUsuario;
    private String cargo;
    private String area;


    ///Constructor

    public Usuario(String codUsuario, String noUsuario, String cargo, String area) throws  CodUsuarioException{
        if(!codUsuario.startsWith("u")) {
            throw new CodUsuarioException ("ERROR: ingresar la u al inicio del código");
        }

        this.codUsuario = codUsuario;
        this.noUsuario = noUsuario;
        this.cargo = cargo;
        this.area = area;
    }


    ///Getter

    public String getCodUsuario() {
        return codUsuario;
    }

    public String getNoUsuario() {
        return noUsuario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getArea() {
        return area;
    }


    //Método para calcular el valor del cargo del usuario
    public int obtenerValorCargo() {

        if (cargo.equals("Gerente")) {
            return 19;
        } else if (cargo.equals("Supervisor")) {
            return 4;
        } else if (cargo.equals("Analista")) {
            return 3;
        } else if (cargo.equals("Practicante")) {
            return 2;
        } else {
            return 1;
        }
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario='" + codUsuario + '\'' +
                ", noUsuario='" + noUsuario + '\'' +
                ", cargo='" + cargo + '\'' +
                ", area='" + area + '\'' +
                //", el valor del cargo es='" + obtenerValorCargo() + '\'' +
                '}';
    }
}
