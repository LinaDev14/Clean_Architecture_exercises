package org.example;

public interface Herviboro extends Animal{
    @Override
    default void respirar() {
        System.out.print("El hervíboro respira - ");
    }

    @Override
    default void comer() {
        System.out.print("El hervíboro come - ");

    }

    @Override
    default void dormir() {
        System.out.print("El hervíboro duerme -");
    }
}
