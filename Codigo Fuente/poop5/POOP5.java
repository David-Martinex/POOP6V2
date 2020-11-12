/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Sirve para poner en prueba todas nuestras clases vistas en esta Practica.
 */
public class POOP5 {
    public static void main(String args[]){
        /**
         * Se da la creacion de c1 y c2 para la clase Circulo
         */
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo( 6.0 );
        /**
         * Se imprime los valores de cada circulo
         */
        System.out.println( c1.toString() );
        System.out.println( c2.toString() );
        /**
         * Se solicita el Area y Perimetro del primer Circulo "c1"
         */
        System.out.println("Perimetro c1 = " + c1.prerimetro() );
        System.out.println("Area del c1 = " + c1.area() );
        /**
         * Se solicita el Area y Perimetro del segundo Circulo "c2"
         */
        System.out.println("Perimetro c2 = " + c2.prerimetro() );
        System.out.println("Area del c2 = " + c2.area() );
        /**
         * Se da el valor del Radio, para despues imprimir 
         *  la nueva Area y Perimetro del primer Circulo "c1"
         */
        System.out.println("************************");
        //c1.radio = 9.0;
        c1.setRadio(9.0);
        System.out.println("Perimetro c1 = " + c1.prerimetro() );
        System.out.println("Area del c1 = " + c1.area() );
        
        System.out.println("************************\n======{ Persona }========\n");
        /**
         * Se crea amigo y fNacimiento para utilizarlas en las clases Persona y Fecha
         */
        Persona amigo = new Persona();
        Fecha fNacimiento = new Fecha(13,5,2001);
        amigo.setNombre("Edggar");
        amigo.setApellido("Romero Martinez");
        amigo.setfNacimiento( fNacimiento );
        System.out.println("Info de mi Amigo: \n" + amigo.toString() );
        /**
         * Se imprime la informacion de amigo
         */
        System.out.println("Info de mi Amigo: \n" + amigo);
        /**
         * Se crea un segundo amigo "amigo2" con una nueva Fecha, para despues imprimir su información
         * y su Fecha
         */
        Persona amigo2 = new Persona("Raul", "Ayala Barbosa", new Fecha(20, 4 ,1993) );
        System.out.println("\nInfo amigo 2: " + amigo2 );
        /**
         * Se crea un tercer amigo "amigo3", para despues imprimir solamente la informacion de amigo3
         */
        Persona amigo3 = new Persona("Diego","Pedraza Peralta");
        System.out.println("\nInfo amigo 3: " + amigo3 );
        /**
         * Se crea TrC para utilizarlo en la clase TrianguloRectangulo
         * Despues da los valores para cada objetos e imprime su información
         */
        System.out.println("************************************");
        TrianguloRectangulo TrC=new TrianguloRectangulo();
        TrC.setAlpha(34);
        TrC.setBetta(56);
        TrC.setCo(10);
        TrC.setCa(6.75f);
        TrC.setHip(12.06f);
        TrC.setTriangulo(true);
        System.out.println("Informacion del Triangulo Cuadrado: "+TrC);
        /**
         * Se crea un segundo triangulo "TrC2" con nuevos valores, despues se pide que imprima su información
         */
        TrianguloRectangulo TrC2=new TrianguloRectangulo(57,false);
        TrC2.setAlpha(34);
        TrC2.setCo(10);
        TrC2.setCa(6.75f);
        TrC2.setHip(12.06f);
        System.out.println("Informacion del Triangulo Cuadrado 2: "+TrC2);
    }
}
