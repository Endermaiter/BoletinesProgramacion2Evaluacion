package com.company;

import marcos.pack.LerDatos;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayMethods {

    public static ArrayList<Libros> engadirLibros(ArrayList<Libros> lista) {
        lista.add(new Libros(LerDatos.lerString("Insertar nome do libro:"),
                LerDatos.lerString("Insertar nome do autor:"),
                LerDatos.lerFloat("Insertar prezo do libro"),
                LerDatos.lerInt("Insertar unidades do libro")));
        return lista;
    }

    public static ArrayList<Libros> consultarLibros(ArrayList<Libros> lista) {
        String pedirtitulo = LerDatos.lerString("Inserte el titulo del libro del que desea saber el precio:");
        Libros libs = new Libros();
        for (int i = 0; i < lista.size(); i++) {
            if (pedirtitulo == libs.getNomeLibro()) {
                JOptionPane.showMessageDialog(null, libs.getPrecio());
            } else {
                JOptionPane.showMessageDialog(null, "O libro non se encontra la libreria");
            }
        }
        return lista;
    }

    public static void amosarLibros(ArrayList<Libros> lista) {
        for (int i = 0; i < lista.size(); i++)
            JOptionPane.showMessageDialog(null, "\n" + lista.get(i));
    }

    public static ArrayList<Libros> eliminarLibros0Stock(ArrayList<Libros> lista) {
        Libros libs = new Libros();
        for (int i = 0; i < lista.size(); i++) {
            if (libs.getUnidades() == 0)
                lista.remove(i);
        }
        return lista;
    }

    public static ArrayList<Libros> modificarPrezo(ArrayList<Libros> lista) {
        String pedirtitulo = LerDatos.lerString("Inserte el titulo del libro del que desea modificar el precio:");
        Libros libs = new Libros();
        for (int i = 0; i < lista.size(); i++) {
            if (pedirtitulo == libs.getNomeLibro()) {
                float novoPrecio = LerDatos.lerFloat("Inserte o novo prezo");
                libs.setPrecio(novoPrecio);
                JOptionPane.showMessageDialog(null,"Precio modificado correctamente");
            }
        }
        return lista;
    }
}