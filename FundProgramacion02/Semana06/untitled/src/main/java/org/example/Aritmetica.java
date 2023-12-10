package org.example;

public class Aritmetica {
    //
    public static int numerador = 10;
    //    public static int denominador = 0;
    public static Integer denominador = 0;
    public static float division;

    public static void main(String[] args) {
        //Crear un programa que me permita realizar una división
        try {
            //Capturar
            division = numerador / denominador;

        } catch (NullPointerException ex) {
            System.out.println("El denominador no debe ser nulo");
        }
        catch (ArithmeticException ex) {
            //Controlando
            System.out.println("El denominador debe ser diferente de cero");
            //division = 2;
        }
        System.out.println(division);

    }
}
