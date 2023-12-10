package org.example;


import java.nio.channels.UnresolvedAddressException;

public class Main {

    public static void main(String[] args) {

        // A)
        // B)
        Cuartel cuartel = new Cuartel("CodCuartel01", "Cuartel 01");

        try {
            Soldado soldado = new Soldado("Jose Torres", 2);
            cuartel.registrarSoldado(soldado);
        } catch (GradoInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        }
        try {
            Soldado soldado = new Soldado("Carlos Matos", 1);
            cuartel.registrarSoldado(soldado);
        } catch (GradoInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        }
        try {
            Soldado soldado = new Soldado("Sofia Gomez", 8);
            cuartel.registrarSoldado(soldado);
        } catch (GradoInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        }

        Tanque tanqueA = new Tanque("modelo01", "torreta1", "municion500");
        Tanque tanqueB = new Tanque("modelo02", "torreta2", "municion750");
        Tanque tanqueC = new Tanque("modelo03", "torreta1", "municion125");

        cuartel.registrarTanque(tanqueA);
        cuartel.registrarTanque(tanqueB);
        cuartel.registrarTanque(tanqueC);

        System.out.println(cuartel);

        // C)
        System.out.println("Intento de registro soldado con grado invalido:");
        try {
            Soldado soldado = new Soldado("Carla Soto", 12);
            cuartel.registrarSoldado(soldado);
        } catch (GradoInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        }

        // D)
        AtaqueFactory factory = new AtaqueFactory();
        System.out.println("Nuevo soldado a traves de Factory");
        try {
            InterfazAtaque elemento = factory.crearElemento("Soldado", "Pepe Guzman", "3");
            cuartel.registrarSoldado((Soldado)elemento);
        } catch (GradoInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nuevo tanque a traves de Factory");
        try {
            InterfazAtaque elemento = factory.crearElemento("Tanque", "Nuevo Tanque", "Torreta05", "Municion1000");
            cuartel.registrarTanque((Tanque) elemento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(cuartel);

    }
}
