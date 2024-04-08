package org.example;

import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //********************EJERCICIO DE LISKOV************************
        System.out.println("------------LISKOV-----------------------------------------");
        //Creación de la figura
        Figura miFigura = new Figura(10,5);
        miFigura.area(10,5);
        miFigura.perimetro(10,5);
        System.out.println("----------------------------------------------------------");

        //Creación del cuadrado
        Cuadrado miCuadrado=new Cuadrado(2,2);
        miCuadrado.area(2);
        miCuadrado.perimetro(2);
        System.out.println("----------------------------------------------------------");

        //Creación del rectángulo
        Rectangulo miRectangulo=new Rectangulo(2,3);
        miRectangulo.area(50,10);
        miRectangulo.perimetro(50,10);
        System.out.println("----------------------------------------------------------");


        //********************EJERCICIO DE RESPONSABILIDAD ÚNICA************************
        System.out.println("------------RESPONSABILIDAD ÚNICA-------------------------");

        Calculadora miCalculadora = new Calculadora();
        double num1=105;
        double num2=53;

        System.out.println("* La suma de los numeros "+num1+ " y "+num2+ " es: "+
                miCalculadora.sumar(num1,num2));
        System.out.println("* La resta de los numeros "+num1+ " y "+num2+ " es: "+
                miCalculadora.restar(num1,num2));
        System.out.println("* La multiplicación de los numeros "+num1+ " y "+num2+ " es: "+
                miCalculadora.multiplicar(num1,num2));

        DecimalFormat dec = new DecimalFormat("#0.00");

        System.out.println("* La división de los numeros "+num1+ " y "+num2+ " es: "+
                dec.format(miCalculadora.dividir(num1,num2)));

        //********************EJERCICIO DE SEGREGACIÓN DE INTERFACES*********************
        System.out.println("------------SEGREGACIÓN DE INTERFACES----------------------");
        System.out.println("--------------PERRO-------------------");
        Perro miPerrito = new Perro();
        miPerrito.respirar();
        miPerrito.comer();
        miPerrito.dormir();

        System.out.println("--------------VACA-------------------");
        Vaca miVaquita = new Vaca();
        miVaquita.respirar();
        miVaquita.comer();
        miVaquita.dormir();




    }
}