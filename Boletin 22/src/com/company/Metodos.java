package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Metodos {

    public static int[][]crearTaboa(int[][]taboa){
        for(int fila=0; fila< taboa.length;fila++){
            for(int columna=0; columna<taboa[fila].length; columna++){
                taboa[fila][columna]= Integer.parseInt(JOptionPane.showInputDialog("Inserte os valores:"));
            }
        }
        return taboa;
    }

    public static void amosarTaboa(int[][]taboa, String[]xornadas, String[]equipos){
        for(int columna=0; columna<xornadas.length; columna++)
            System.out.print("  " + xornadas[columna]);
        for(int fila = 0; fila<taboa.length;fila++){
            System.out.print("\n"+equipos[fila]+"  ");
            for(int columna=0;columna<taboa[fila].length;columna++){
                System.out.print(taboa[fila][columna]+ "  ");
            }
        }
    }

    public static int[] sumarGoles(int[][]taboa,int[]sumas) {
        int suma = 0;
        for (int fila = 0; fila < taboa.length; fila++) {
            suma = 0;
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                suma = suma + taboa[fila][columna];
            }
            sumas[fila] = suma;
        }
        return sumas;
    }



    public static String[] amosarEquipos(String[]equipos){
        for (int i = 0; i < equipos.length; i++) {
                System.out.print(equipos[i] + "  ");
        }
        return equipos;
    }

    public static void amosarGoles(int[]sumas){
        for (int i = 0; i < sumas.length; i++) {
            System.out.print(sumas[i] + "  ");
        }
    }

    public static void ordearSumas(int[]sumas){
        Arrays.sort(sumas);
    }

    public static void maisGoles(int[][]taboa, String[]equipos, String[]xornadas) {
        int mayor = taboa[0][0];
        int fila;
        int columna =0;
        for (fila = 1; fila < taboa.length; fila++) {
            for (columna = 1; columna < taboa[fila].length; columna++){
                if (taboa[fila][columna] > mayor) {
                    mayor = taboa[fila][columna];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"El mayor numero de goles es : " + mayor + "feitos polo equipo" + equipos[taboa[fila].length] + " na xornada" + xornadas[taboa[columna].length]);
    }

    public static void consultas(int[][]taboa, String[]equipos, String[]xornadas){
        String equipoBuscar = JOptionPane.showInputDialog("Inserte el equipo:");
        int xornadaBuscar = Integer.parseInt(JOptionPane.showInputDialog("Inserte a xornada:"));

        for(int fila=0; fila< taboa.length;fila++){
            for(int columna = Integer.parseInt(xornadas[xornadaBuscar-1]); columna<taboa[fila].length;columna++){
                if(equipos[fila].equals(equipoBuscar)){
                    JOptionPane.showMessageDialog(null, "O numero de goles é "+ taboa[fila][columna]);
                }
            }
        }


    }
}






