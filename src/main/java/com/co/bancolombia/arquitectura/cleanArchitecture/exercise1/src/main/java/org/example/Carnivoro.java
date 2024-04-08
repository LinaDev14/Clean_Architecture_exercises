package org.example;

public interface Carnivoro extends Animal{
    @Override
    default void respirar() {
        System.out.print("El carnívoro respira - ");
    }

    @Override
    default void comer() {
        System.out.print("El carnívoro come - ");

    }

    @Override
    default void dormir() {
        System.out.print("El carnívoro duerme - ");
    }
}
