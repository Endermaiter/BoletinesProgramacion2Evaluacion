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
                    try{
                        ArrayMethods.eliminarLibros((libros));
                        break;
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                case 3:
                    try{
                        ArrayMethods.amosarLibros(libros);
                        break;
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                case 4:
                    try{
                        ArrayMethods.eliminarLibros0Stock(libros);
                        break;
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                case 5:
                    try{
                        ArrayMethods.consultarLibro(libros);
                        break;
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                case 6:
                    System.exit(0);
            }
        }while(opcion<10);
    }
}
