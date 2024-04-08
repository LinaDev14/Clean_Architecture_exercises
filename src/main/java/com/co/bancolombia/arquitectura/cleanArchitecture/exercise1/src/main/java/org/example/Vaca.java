package org.example;

public class Vaca implements Herviboro{

    public Vaca() {
    }

    @Override
    public void respirar() {
        Herviboro.super.respirar();
        System.out.println("La vaca respira");
    }

    @Override
    public void comer() {
        Herviboro.super.comer();
        System.out.println("La vaca come");
    }

    @Override
    public void dormir() {
        Herviboro.super.dormir();
        System.out.println("La vaca duerme");
    }
}
