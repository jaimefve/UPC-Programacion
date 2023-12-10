package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            Persona objPer1 = new Persona("Luis",30);
            Persona objPer2 = new Persona("Marcos",-1);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }
}