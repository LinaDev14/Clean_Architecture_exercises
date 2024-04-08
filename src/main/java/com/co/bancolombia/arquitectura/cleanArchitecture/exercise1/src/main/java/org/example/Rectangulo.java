package org.example;

import java.text.NumberFormat;

public class Rectangulo extends Figura{

    public Rectangulo(int alto, int ancho) {
        super(alto, ancho);
    }
    public void area(int lado1, int lado2){
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        final String ANSI_G = "\u001B[32m";
        final String ANSI_GREEN = "\u001B[36m";
        long area=0;

        area=lado1*lado2;

        System.out.println(ANSI_G+"El área de su rectángulo es: "+area);
    }

    public void perimetro(int lado, int lado2){
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        final String ANSI_G = "\u001B[32m";
        final String ANSI_GREEN = "\u001B[36m";
        long perimetro=0;

        perimetro=lado+lado2;

        System.out.println(ANSI_G+"El perímetro de su rectángulo: "+perimetro);
    }

}
