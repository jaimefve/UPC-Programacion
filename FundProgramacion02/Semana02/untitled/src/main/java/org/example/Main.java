package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Sirve para recoger texto por consola
    static Scanner scanner = new Scanner(System.in);

    static int select = -1;
    static int num1 = 0, num2=0;



    public static void main(String[] args) {
        //Mientras la opcion elegia sea diferente de 0
        while(select !=0) {
            //Programa que permita realizar las 4 operaciones basicas
            System.out.println("Elija una opcion\n1. Sumar" +
                    "\n2. Restar\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "0. Salir");
            //Obtener la variable por consola
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    pideNumeros();
                    System.out.println(num1 + "-" + num2 + "=" + (num1+num2));
                    break;
                case 2:
                    pideNumeros();
                    System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                    break;
                case 3:
                    pideNumeros();
                    System.out.println(num1 + "-" + num2 + "=" + (num1*num2));
                    break;
                case 4:
                    pideNumeros();
                    System.out.println(num1 + "-" + num2 + "=" + (num1/num2));
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Numero no reconocido");
                    break;
            } //Fin del switch
        } //Fin de While
    }
    public static void pideNumeros() {
        System.out.println("Ingresar numero 1");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresar numero 2");
        num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("\n");
    }

}