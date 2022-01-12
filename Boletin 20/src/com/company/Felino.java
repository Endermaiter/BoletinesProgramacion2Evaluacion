package com.company;

public class Felino extends Mamífero implements IPodeNadar{

    @Override
    public void camiñar() {
        super.camiñar();
        System.out.println("O gato é un mamífero que pode camiñar");
    }

    @Override
    public void nadar() {
        System.out.println("O gato é un mamífero que pode nadar");

    }
    //non é necesario implementar todos os métodos das interfaces nesta clase porque a clase gato é unha subclase de mamífero, la cual ya tiene implementada la interfaz IPodeCamiñar.
}
