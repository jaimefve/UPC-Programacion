package org.example;

public class Arreglos {
    public static void main(String[] args) {

        int[] myArray = new int[3];
        try {
            myArray[3] = 8;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
