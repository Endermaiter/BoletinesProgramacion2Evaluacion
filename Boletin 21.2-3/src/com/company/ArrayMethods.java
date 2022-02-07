package com.company;

import javax.swing.*;
import java.util.Arrays;

public class ArrayMethods {

    public static int numAp(int[] notas) {
        int contAp=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>4){
                contAp++;
            }
        }
        return contAp;
    }

    public static int numSusp(int[] notas) {
        int contSusp=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]<5){
                contSusp++;
            }
        }
    return contSusp;
    }

    public static float notaMedia(int[] notas) {
        int suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
        }
        float notaMedia=suma/(notas.length-1);
        return notaMedia;
    }

    public static int notaAlta(int[] notas) {
        int max = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }

        }
    return max;
    }

    public static int pedirAlumnoDarNota(int[]notas,String[]alumnos){
        int alumnoPedido = Integer.parseInt(JOptionPane.showInputDialog("Inserte el alumno:"));
        int posicion = 0;
        for (int i = 0; i < notas.length; i++) {
            if (alumnos[i].equals(alumnoPedido)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }


    public static int[] ordearNotas(int[]notas){
        Arrays.sort(notas);
        return notas;
    }

    public static String[] alumnosAprobados(int[]notas, String[]alumnos){
        for(int i=0; i<notas.length;i++){
            if(notas[i]>4){
                JOptionPane.showMessageDialog(null, alumnos[i]);
            }
        }
        return alumnos;
    }
}
