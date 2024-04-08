package org.example;

import java.text.NumberFormat;

public class Cuadrado extends Figura{
    public Cuadrado(int alto, int ancho) {
        super(alto, ancho);
    }
    public void area(int lado){
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        final String ANSI_G = "\u001B[32m";
        final String ANSI_GREEN = "\u001B[36m";
        long area=0;

        area=lado*lado;

        System.out.println(ANSI_G+"El área de su cuadrado es: "+area);
    }

    public void perimetro(int lado){
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        final String ANSI_G = "\u001B[32m";
        final String ANSI_GREEN = "\u001B[36m";
        long perimetro=0;

        perimetro+=lado;

        System.out.println(ANSI_G+"El perímetro de su cuadrado: "+perimetro);
    }


}
