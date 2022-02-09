package com.company;

public class Main {

    public static void main(String[] args) {
	    String ex1 = "Esto é Java!";
        System.out.println("O string \"Esto é Java!\" ten " + ex1.length() + " caracteres");

        String ex2 = "Java";
        char[] array1 = ex2.toCharArray();
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\n");
        }
        System.out.println("\n");
        String ex3 = "Java desde 0";
        char[] array2 = ex3.toCharArray();
        String text = "";
        for(int i=array2.length-1;i>=0;i--) {
            text = text + array2[i];
        }
        System.out.println("O string \"Java desde 0\" é ao revés: "+text);

        String ex4 = "James Gosling Created Xava";
        System.out.println("Quitando os espazos de \"James Gosling Created Xava\" queda " + ex4.replace(" ",""));

        String ex5 = "java java java";
        int contadorVocales = 0, contadorConsonantes = 0;
            for(int i = 0; i < ex5.length(); i++){
                char ch = ex5.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    contadorVocales++;
                }
                else{
                contadorConsonantes++;
                }
            }
            System.out.println("\"java java java\" tiene "+ contadorVocales+ " vocales y "+contadorConsonantes+" consonantes");

        String ex6 = "www. javadesde0. com";
        String parte1 = ex6.substring(0,9);
        String parte2 = ex6.substring(9,20);
        System.out.println(parte1+"   "+parte2);
        System.out.println(parte1+parte2);

        String ex7 = "javeros";
        String maiusculas = ex7.toUpperCase();
        String minisculas = maiusculas.toLowerCase();
        System.out.println(maiusculas);
        System.out.println(minisculas);

        String ex81 = "Java";
        String ex82 = "JavaScript";
        boolean resultado = ex81.equalsIgnoreCase(ex82);
        System.out.println(resultado);

        String ex9 = "jeve jeve jeve";
        System.out.println("O string cambiado é "+ex9.replace("e","a"));

        String ex10 = "ABCD";
        char[]array3 = ex10.toCharArray();
        for(int i=0;i< array3.length;i++){
            int ascii = array3[i];
            System.out.println("El caracter " +array3[i]+" es em Codigo ASCII: "+ ascii);
        }

        String ex11 = "Ola, son alumno de DAM1, e son programador desde o 2021";
        String obx=new String();
        int espazosBranco = 0;
        int contadorNumeros = 0;
        for(int i=0; i<ex11.length();i++){
            if(ex11.charAt(i) == 32){
                espazosBranco++;
            }
            if(ex11.charAt(i)>=48 && ex11.charAt(i)<=57){
                contadorNumeros++;
            }
        }
        System.out.println("A cadea de caracteres: \"Ola, son alumno de DAM1, e son programador desde o 2021\" ten "+(ex11.length()-espazosBranco-contadorNumeros)+" caracteres, " + espazosBranco + " espazos en branco e "+contadorNumeros+" numeros");

    }


}
