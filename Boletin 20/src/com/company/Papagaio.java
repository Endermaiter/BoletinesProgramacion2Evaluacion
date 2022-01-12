package com.company;

public class Papagaio extends Aves implements IPodeCamiñar{

    @Override
    public void camiñar() {
        System.out.println("O papagaio é un animal que pode camiñar");
    }

    @Override
    public void voar() {
        super.voar();
        System.out.println("O papagaio é un animal que pode voar");
    }
}
