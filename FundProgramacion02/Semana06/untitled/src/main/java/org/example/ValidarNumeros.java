package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarNumeros {
    public static void main(String[] args) {
        //Crear un programa que me permita validar numeros
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            try {
                System.out.println("Ingresar un numero");
                int input  = scanner.nextInt();
                System.out.println("Numero ingresado es: " + input);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Haz ingresado una letra o un valor diferente  a un numero");
                scanner.next();
            }
        }


    }
}