package org.example;

public class Perro implements Carnivoro{
    public Perro() {
    }

    @Override
    public void respirar() {
        Carnivoro.super.respirar();
        System.out.println("El Perro respira");
    }

    @Override
    public void comer() {
        Carnivoro.super.comer();
        System.out.println("El Perro come");
    }

    @Override
    public void dormir() {
        Carnivoro.super.dormir();
        System.out.println("El Perro duerme");
    }
}
