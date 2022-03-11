package clasesLibro;

import marcos.pack.LerDatos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ArrayMethods {

    public static ArrayList<Libro> engadirLibro(ArrayList<Libro> lista){
        lista.add(new Libro(LerDatos.lerString("Insertar titulo:"),
                            LerDatos.lerString("Insertar autor:"),
                            LerDatos.lerString("Insertar ISBN:"),
                            LerDatos.lerFloat("Insertar prezo:"),
                            LerDatos.lerInt("Insertar stock:")));
        return lista;
    }

    public static ArrayList<Libro> eliminarLibros(ArrayList<Libro>lista){
        String  pedirProDelete = LerDatos.lerString("Inserte el ISBN del libro que desea eliminar");
        Libro lib = new Libro();
        for(int i = 0; i< lista.size();i++) {
            if (pedirProDelete == lib.getISBN())
                lista.remove(i);
        }
        return lista;
    }

    public static void amosarLibros(ArrayList<Libro> lista){
        for(int i=0;i<lista.size();i++)
            JOptionPane.showMessageDialog(null,"\n"+lista.get(i));
    }

    public static ArrayList<Libro> eliminarLibros0Stock(ArrayList<Libro>lista){
        Libro lib = new Libro();
        for(int i = 0; i< lista.size();i++) {
            if (lib.getNumUnidades() == 0)
                lista.remove(i);
        }
        return lista;
    }

    public static ArrayList<Libro> consultarLibro(ArrayList<Libro>lista){
        String  pedirProDelete = LerDatos.lerString("Inserte el ISBN del libro que desea consultar");
        Libro lib = new Libro();
        for(int i = 0; i< lista.size();i++) {
            if (pedirProDelete == lib.getISBN())
                JOptionPane.showMessageDialog(null,"\n"+lista.get(i));
        }
        return lista;
    }

}
