public class Usuario {
    private String codUsuario;
    private String noUsuario;
    private String cargo;
    private String area;

    //Constructor Exception
    public Usuario(String codUsuario, String noUsuario, String cargo, String area) throws CodUsuarioException{
        if(!codUsuario.startsWith("u")){
            throw new CodUsuarioException("Ingresar el código con la u al inicio");
        }
        this.codUsuario = codUsuario;
        this.noUsuario = noUsuario;
        this.cargo = cargo;
        this.area = area;
        }

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

    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario='" + codUsuario + '\'' +
                ", noUsuario='" + noUsuario + '\'' +
                ", cargo='" + cargo + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
