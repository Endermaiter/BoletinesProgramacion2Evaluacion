package com.company;

public class Main {

    public static void main(String[] args) {
	ConversorTemperaturas obx = new ConversorTemperaturas();
    try{
        obx.centigradosAFharenheit();
    }catch (TemperaturaErradaExcepcion ex){
        System.out.println("erro 1 "+ ex.toString());
    }

    }
}
