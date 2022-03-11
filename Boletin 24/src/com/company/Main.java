package com.company;

import clasesLibro.ArrayMethods;
import clasesLibro.Libro;
import marcos.pack.LerDatos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int opcion;

        ArrayList<Libro> libros = new ArrayList<Libro>();

        do{
            opcion = LerDatos.lerInt("1.Engadr libro.\n 2.Vender libro\n 3.Mostrar libros \n 4.Eliminar libros con 0 stock\n 5.Consultar libro\n 6.Sair");

            switch (opcion){
                case 1:
                    ArrayMethods.engadirLibro(libros);
                    break;
                case 2:
                    ArrayMethods.eliminarLibros((libros));
                case 3:
                    ArrayMethods.amosarLibros(libros);
                case 4:
                    ArrayMethods.eliminarLibros0Stock(libros);
                case 5:
                    ArrayMethods.consultarLibro(libros);
                case 6:
                    System.exit(0);
            }
        }while(opcion<10);
    }
}
