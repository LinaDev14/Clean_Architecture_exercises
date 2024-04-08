package org.example;

import java.text.NumberFormat;

public class Figura {

    private int alto;
    private int ancho;


    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Figura(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public void area(int lado1, int lado2){
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        final String ANSI_G = "\u001B[32m";
        final String ANSI_GREEN = "\u001B[36m";
        long area=0;

        area=lado1*lado2;

        System.out.println(ANSI_G+"El área de su figura es: "+area);
    }

    public void perimetro(int lado1, int lado2){
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        final String ANSI_G = "\u001B[32m";
        final String ANSI_GREEN = "\u001B[36m";
        long perimetro=0;

        perimetro=lado1+lado2;

        System.out.println(ANSI_G+"El área de su figura es: "+perimetro);
    }


}
