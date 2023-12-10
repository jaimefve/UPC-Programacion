package org.example;
public class Silla {
    private Pata[] patas;
    private int numPatas =0;
    public Silla() {
        //En el constructor de la silla que inicializando las patas:

        patas = new Pata[4];
    }
    //Metodo para agregar Pata
    public void agregarPata(String color, float peso) {
        patas[numPatas] = new Pata(color,peso);
        this.numPatas++;
    }
    public int getNumPatas() {
        return numPatas;
    }
}