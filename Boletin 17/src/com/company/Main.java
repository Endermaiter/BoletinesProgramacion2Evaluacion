package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    String repetir = ("si");
    Notas obx = new Notas();
    while(repetir.equalsIgnoreCase("si")){
        obx.introducirValores();
        JOptionPane.showMessageDialog(null, "La nota de las pruebas teoricas es " + obx.notaEscrita());
        JOptionPane.showMessageDialog(null, "La nota de las pruebas prácticas es " + obx.notaPractica());
        JOptionPane.showMessageDialog(null, "La nota de los boletines es " + obx.notaBoletines());
        JOptionPane.showMessageDialog(null, "La nota final es " + (obx.notaEscrita()+obx.notaPractica()+obx.notaBoletines()));
        repetir = JOptionPane.showInputDialog("¿Deseas calcular otra nota?");
    }
    JOptionPane.showMessageDialog(null, "Fin do programa");

    }
}
