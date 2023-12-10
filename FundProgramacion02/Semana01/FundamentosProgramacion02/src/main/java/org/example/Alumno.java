package org.example;

public class Alumno {

    //Crear un programa que permite crear el promedio de tres notas

    //atributos
    private int codigo;
    private String nombres;
    private int nota1;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Metodo que retorno el nombre
    public String getNombres() {
        return nombres;
    }

    //Metodo que cambia el valor del atributo
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    private int nota2;
    private int nota3;

    public Alumno(int codigo, String nombres) {
        this.codigo = codigo;
        this.nombres = nombres;
    }
    //Constructor con 5 parametros
    public Alumno(int codigo, String nombres, int nota1, int nota2, int nota3) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    //Constructor sin atributos
    public Alumno() {
    }


    public double calcularPromedio() {
        double resultado=0;
        resultado = (this.nota1 + this.nota2 + this.nota3)/3;
        return resultado;
    }

    public void mensaje() {


    }

}
