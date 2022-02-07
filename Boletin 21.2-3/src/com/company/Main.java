package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[]notas = new int[5];
    String[]alumnos = {"Pepe", "Jose", "Marbel", "Juana", "MariaJose"};
        //damos valores random al array notas
        for(int i=0; i<notas.length;i++){
            notas[i]= (int) (Math.random()*11);
        }



    int opcion;
    do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú: \n 1.Visualizar numero de aprobados e suspensos \n 2.Nota media da clase \n 3.Nota mais alta \n 4.Visualizar a nota dun alumno determinado. \n 5.Visualizar unha lista co nome dos alumnos aprobados. \n 6.Lista ordenada por orden crecente de notas."));

        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null, "Hay "+ ArrayMethods.numAp(notas) + " alumnos aprobados e "+ ArrayMethods.numSusp(notas) +" alumnos suspensos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "A nota media da clase é "+ ArrayMethods.notaMedia(notas));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, " A nota mais alta foi "+ ArrayMethods.notaAlta(notas));
                break;
            case 4:
                //ejercicio extremadamente aclaratorio
                JOptionPane.showMessageDialog(null, "O alumno "+ alumnos[ArrayMethods.pedirAlumnoDarNota(notas, alumnos)]+"tivo una nota de "+notas[ArrayMethods.pedirAlumnoDarNota(notas, alumnos)]);
            case 5:
                ArrayMethods.alumnosAprobados(notas, alumnos);
            case 6:
                JOptionPane.showMessageDialog(null, ArrayMethods.ordearNotas(notas));
        }
    }while(opcion<10);
    }
}
