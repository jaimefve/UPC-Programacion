package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Empresa_Revisiones empresa = new Empresa_Revisiones("Farenet");
        empresa.agregarVehiculo(new Ligero("DEF-150","Hyuandi","Elantra",2019,
                "M1",3,2,3,3,3));
        //empresa.agregarVehiculo(new Moto(""));
        empresa.listarVehiculos();

    }
}