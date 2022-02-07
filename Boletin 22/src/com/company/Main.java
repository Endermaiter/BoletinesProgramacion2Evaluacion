package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int [][]taboa = new int[3][3];
    String[]xornadas = {"Equipo/Xornada", "X1", "X2","X3"};
    String[]equipos = {"Celta", "Bilbao","Málaga"};
    int[]sumas = new int[3];

    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú: \n 1.Gravar e imprimir a taboa. \n 2.Ordear equipos por menor Nº Goles. \n 3.Equipo con mais goles/xornada. \n 4.Equipo e xornada con mais goles. \n 5.Consulta equipo+xornada por goles"));

        do{
            switch (opcion){
            case 1:
                Metodos.crearTaboa(taboa);
                Metodos.amosarTaboa(taboa,xornadas,equipos);
                break;
            case 2:
                Metodos.sumarGoles(taboa,sumas);
                Metodos.ordearSumas(sumas);
                Metodos.amosarGoles(sumas);
                break;
            case 3:
                break;
            case 4:
                Metodos.maisGoles(taboa,equipos,xornadas);
                break;
            case 5:
                Metodos.consultas(taboa, equipos, xornadas);
            }
        }while(opcion<8);
    }
}
