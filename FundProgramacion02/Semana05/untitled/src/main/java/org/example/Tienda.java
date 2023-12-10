package org.example;

public class Tienda {
    //Atributo privado de mi clase asociada de mi clase que voy agregar.
    private Cliente[] clientes = new Cliente[3];
    private int numClientes=0;

    public Tienda() {
    }

    //Preguntas:
    //a. Obtener la cantidad de clientes.
    public void addCliente(Cliente cliente) {
        clientes[numClientes] = cliente;
        this.numClientes++;
        //this.numClientes = this.numClientes + 1;
    }

    //Obtener el numero de clietne

    public int getNumClientes() {
        return numClientes;
    }
}
