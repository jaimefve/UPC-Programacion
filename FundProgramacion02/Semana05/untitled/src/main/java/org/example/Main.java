package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Tienda tienda  = new Tienda();
        tienda.addCliente(new Cliente("Jymmy"));
        tienda.addCliente(new Cliente("Jaime"));
        tienda.addCliente(new Cliente("Luis"));
        System.out.println(tienda.getNumClientes());


        Silla silla = new Silla();
        silla.agregarPata("Negro",10f);
        silla.agregarPata("Negro",10f);
        silla.agregarPata("Negro",10f);
        silla.agregarPata("Negro",10f);
        System.out.println(silla.getNumPatas());
    }
}