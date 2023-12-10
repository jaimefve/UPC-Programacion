package controller;

public class SoyUnico {
    private String nombre;
    private static SoyUnico soyUnico;
    //Metodos Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static SoyUnico getSoyUnico() {
        return soyUnico;
    }
    public static void setSoyUnico(SoyUnico soyUnico) {
        SoyUnico.soyUnico = soyUnico;
    }

    //Constructor privado
    private SoyUnico(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static SoyUnico getSingletonInstance(String nombre) {
        if (soyUnico==null) {
            soyUnico = new SoyUnico(nombre);
        } else {
            System.out.println("No se puede crear el objeto" + nombre + "Por que ya existe la clase");
        }
        return soyUnico;
    }
}
