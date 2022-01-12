package com.company;

import javax.swing.*;

public class Notas {

    private float probEsc1;
    private float probEsc2;
    private float probPrac;
    private int porcentaxeBoletines;

    public Notas() {
    }

    public Notas(float probEsc1, float probesc2, float probPrac, int porcentaxeBoletines) {
        this.probEsc1 = probEsc1;
        this.probEsc2 = probesc2;
        this.probPrac = probPrac;
        this.porcentaxeBoletines = porcentaxeBoletines;
    }

    public float getProbEsc1() {
        return probEsc1;
    }

    public void setProbEsc1(float probEsc1) {
        this.probEsc1 = probEsc1;
    }

    public float getProbEsc2() {
        return probEsc2;
    }

    public void setProbEsc2(float probEsc2) {
        this.probEsc2 = probEsc2;
    }

    public float getProbPrac() {
        return probPrac;
    }

    public void setProbPrac(float probPrac) {
        this.probPrac = probPrac;
    }

    public int getPorcentaxeBoletines() {
        return porcentaxeBoletines;
    }

    public void setPorcentaxeBoletines(int porcentaxeBoletines) {
        this.porcentaxeBoletines = porcentaxeBoletines;
    }

    public void introducirValores(){
        probEsc1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la nota del primer examen escrito:"));
        probEsc2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la nota del segundo examen escrito:"));
        probPrac=Integer.parseInt(JOptionPane.showInputDialog("Inserte la nota del examen práctico:"));
        porcentaxeBoletines=Integer.parseInt(JOptionPane.showInputDialog("Inserte el porcentaje de boletines realizados(sin el simbolo %):"));
    }

    public float notaEscrita(){
        float mediaEscrita = (probEsc1+probEsc2)/2;
        float notaEsc = (float) (mediaEscrita*0.4);
        return notaEsc;
    }

    public float notaPractica(){
        float notaPractica = (float) (probPrac*0.4);
        return notaPractica;
    }

    public float notaBoletines(){

        if(porcentaxeBoletines>90){
            float notaBoletines = 2;
            float notaFinalBoletines = (float) (notaBoletines*0.2);
            return notaFinalBoletines;
        }
        else if(porcentaxeBoletines>70&&porcentaxeBoletines<90){
            float notaBoletines = 1;
            float notaFinalBoletines = (float) (notaBoletines*0.2);
            return notaFinalBoletines;
        }
        else{
            float notaBoletines = 0;
            float notaFinalBoletines = (float) (notaBoletines*0.2);
            return notaFinalBoletines;
        }
    }

}
