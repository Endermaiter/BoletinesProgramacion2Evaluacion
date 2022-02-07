package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[6];
        MetodosArray obx = new MetodosArray();
        numeros = obx.array150(numeros);
        obx.amosarArray(numeros); //este metodo amosara o primeiro array creado con nums aleatorios
        obx.invertirArray(numeros);//e a continuacion este metodo mostrará o array dado a volta
    }
}
