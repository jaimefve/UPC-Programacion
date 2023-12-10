package org.example;

import java.io.Console;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // A)
        // B)
        Empresa empresa = new Empresa();

        SalaRegular salaRegularA = new SalaRegular("CodSal1", "Sala Primavera", 30, 10, 1.05);
        SalaRegular salaRegularB = new SalaRegular("CodSal2", "Sala Benavides", 15, 25, 1.15);

        Sala4D sala4DA = new Sala4D("CodSal3", "Sala Miraflores", 20, 35, "aire-plus-250", "vib-max-450");
        Sala4D sala4DB = new Sala4D("CodSal4", "Sala Larcomar", 25, 45, "aire-max-300", "vib-reg-300");

        empresa.registrarSala(salaRegularA);
        empresa.registrarSala(salaRegularB);
        empresa.registrarSala(sala4DA);
        empresa.registrarSala(sala4DB);

        System.out.println("Salas Registradas:");
        List<Sala> salasRegistradas = empresa.getSalas();
        for (Sala s: salasRegistradas) {
            System.out.println(s);
        }

        // C)
        SalaFactory salaFactory = new SalaFactory();

        Sala salaRegularC = salaFactory.crear("Regular", "CodSal5", "Sala Monterrico", "17", "14.5", "1.03");
        Sala sala4DC = salaFactory.crear("4D", "CodSal6", "Sala Santa Anita", "33", "40", "aire-plus-250", "vib-max-450");

        empresa.registrarSala(salaRegularC);
        empresa.registrarSala(sala4DC);

        System.out.println("Salas registradas con Factory");
        salasRegistradas = empresa.getSalas();
        for (Sala s: salasRegistradas) {
            System.out.println(s);
        }

        // D)
        System.out.println("Usando consola:");
        Consola consola = Consola.getInstance();
        consola.listarSalas(salasRegistradas);

    }
}
