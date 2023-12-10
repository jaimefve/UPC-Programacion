package org.example;

public class SalaFactory {

    public Sala crear(String tipo, String... args) {
        if (tipo.equals("Regular")) {
            return new SalaRegular(args[0], args[1], Integer.parseInt(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]));
        } else if (tipo.equals("4D")) {
            return new Sala4D(args[0], args[1], Integer.parseInt(args[2]), Double.parseDouble(args[3]), args[4], args[5]);
        }
        return null;
    }
}
