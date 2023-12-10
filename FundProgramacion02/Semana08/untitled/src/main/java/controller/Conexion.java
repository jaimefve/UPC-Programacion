package controller;

public class Conexion {
    private String host;
    private String baseDatos;
    private static Conexion conexion;
    public static Conexion getConexion(String host, String baseDatos) {
        if (conexion==null) {
            conexion = new Conexion(host,baseDatos);
        }
        return conexion;
    }
    private Conexion(String host, String baseDatos) {
        this.host = host;
        this.baseDatos = baseDatos;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }

    public String getBaseDatos() {
        return baseDatos;
    }
    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
}
