package com.company;

import marcos.pack.LerDatos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int opcion;

        ArrayList<Libros>ficheiro = new ArrayList<>();
        do{

            opcion = LerDatos.lerInt("1.Engadir libro.\n 2.Consultar titulo polo prezo.\n 3.Visualizar.\n 4.Borrar libros sen stock. \n 5.Modificar precio\n 6.Salir");

            switch (opcion){
                case 1:
                    ArrayMethods.engadirLibros(ficheiro);
                    break;
                case 2:
                    ArrayMethods.consultarLibros(ficheiro);
                    break;
                case 3:
                    ArrayMethods.amosarLibros(ficheiro);
                    break;
                case 4:
                    ArrayMethods.eliminarLibros0Stock(ficheiro);
                    break;
                case 5:
                    ArrayMethods.modificarPrezo(ficheiro);
                    break;
                case 6:
                    System.exit(0);
            }
        }while(opcion<10);
    }
}
