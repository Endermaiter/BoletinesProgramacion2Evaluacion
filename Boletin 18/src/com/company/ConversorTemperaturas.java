package com.company;

import javax.swing.*;

public class ConversorTemperaturas {

    private final int tempLimite = 80;

    public float centigradosAFharenheit() throws TemperaturaErradaExcepcion {
        float centigrados=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la temperatura en grados centígrados"));
        float fharenheir = (float) (9.0 / 5.0 * centigrados + 32.4);
        if (centigrados < tempLimite) {
            throw new TemperaturaErradaExcepcion("Non se admiten temperaturas inferiores a 80ºC");
        } else {
            System.out.println("La temperatura en Fharenheir es de "+ fharenheir +"ºF");
            return fharenheir;
        }
    }

    public void centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        float Reamur = (float) (4.0 / 5.0 * centigrados);
        if (centigrados < tempLimite) {
            throw new TemperaturaErradaExcepcion("Non se admiten temperaturas inferiores a 80ºC");
        }
    }
}
