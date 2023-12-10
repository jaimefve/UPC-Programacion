public class CodUsuarioException extends Exception{

    public CodUsuarioException() {
        super("Ingresar el código con la u al inicio");}
    public CodUsuarioException(String message) {
        super(message);
    }

}
