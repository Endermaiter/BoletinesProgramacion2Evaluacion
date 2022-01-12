package com.company;

public class Main {

    public static void main(String[] args) {
	IPodeCantar canario = new Canario();
    canario.cantar();
    IPodeCantar tenor = new Persoa();
    tenor.cantar();
    }
}
