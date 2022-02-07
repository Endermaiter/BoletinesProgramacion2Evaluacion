package com.company;

import javax.swing.*;
import java.util.Arrays;

public class MetodosArray {

    public int[] array150(int[]numeros){
        for(int i=0; i<numeros.length;i++){
            numeros[i]= (int) (Math.random()*51);
        }
        return numeros;
    }


    public void amosarArray(int[]numeros){
        JOptionPane.showMessageDialog(null, Arrays.toString(numeros));
    }

    public int[] invertirArray(int[]numeros){
        int aux=0;
        for (int i=0; i<numeros.length/2; i++) {
            aux = numeros[i];
            numeros[i] = numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] = aux;
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(numeros));
        return numeros;
    }


}
