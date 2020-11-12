/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Clase circulo que se encarga de crear objetos con datos necesarios para un circulo
 */
public class Circulo {
    static double PI = Math.PI;    
    private double radio;
    private String color;

    /**
     * Constructor encargado de crear un objeto circulo sin llenar ninguno de sus parametros e
     * Imprime el mensaje con el que da aviso que se ha creado nuestro nuevo circulo
     */
    public Circulo()
    {
        System.out.println("Se a creado el circulo");
    }
    
    /**
     * Tipo de constructor encargado de crear un circulo con un radio e imprime que se creo
     * @param radio El circulo toma los valores del radio para su creacion
     */
    public Circulo( double radio )
    {
        this.radio = radio;
        System.out.println("Se a creado el circulo");
    }
    
    /**
     * Regresa el radio del circulo
     * @return radio Regresa el valor del Radio
     */
    public double getRadio() {
        return radio;
    }
    
    /**
     * Inserta un Radio en nuestro circulo
     * @param radio Se toma para ser insertarsetado en un circulo ya creado
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Funcion encargada de imprimit todos los datos de nuestro circulo
     * @return Regresa un mensaje donde imprime todos los datos de nuestro circulo
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }

    /**
     * Metodo encargado de sacar el perimetro del circulo
     * @return 2*PI*radio que es el calculo del perimetro del circulo
     */
    public double prerimetro(){
        return 2* PI * radio;
    }
    /**
    * Regresa el nuevo valor que puede tener la Area del Circulo
    */
    public double area(){
        return PI * radio * radio;
    }
}
