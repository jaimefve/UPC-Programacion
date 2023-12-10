package org.example;

public class AtaqueFactory {

    public InterfazAtaque crearElemento(String tipo, String... args) throws GradoInvalidoExcepcion {
        if (tipo.equals("Soldado")) {
            return new Soldado(args[0], Integer.parseInt(args[1]));
        } else if (tipo.equals("Tanque")) {
            return new Tanque(args[0], args[1], args[2]);
        }
        return null;
    }
}
