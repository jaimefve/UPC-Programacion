package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //RPTA A, RPTA B, RPTA C
        //1ro creado una tienda
        Tienda tienda = new Tienda("BlockBuster");
        //2do creamos la catogoria
        Categoria cat1=null;
        Categoria cat2=null;
        try {
            cat1 = new Categoria("1","Suspenso");
            cat2 = new Categoria("2","Documental");

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        //Categoria cat1 = new Categoria("1","Suspenso");
        //Categoria cat2 = new Categoria("2","Documental");

        //3ero creamos la pelicula
        Pelicula peli1 = new Pelicula(1,"Scream 5",cat1);
        //peli1.agregarActor("Yena Ortega",);
        peli1.agregarActor(new Actor("Yena Ortega","USA"));
        peli1.agregarActor(new Actor("Actor 2","USA"));

        //4to agregar pelicula
        tienda.agregarPelicula(peli1);
        System.out.println(peli1.toString());

    }
}