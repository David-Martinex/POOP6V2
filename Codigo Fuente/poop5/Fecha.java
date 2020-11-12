/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Clase Fecha encargada de crear un objeto para el almacenamiento de dia, mez y Año 
 * de una fecha en especifico.
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    /**
     * Constructor del Objeto Fecha con datos ya declarados en caso de no asignarle
     * ninguno previamente.
     */
    public Fecha() {
        this.dia = 13;
        this.mes = 5;
        this.anio = 2001;
    }
    /**
     * Contructor de Fecha encargado de crear un Objeto Fecha con los datos que recibe.
     * @param dia Se le indica como se debe llamar "dia"
     * @param mes Se le indica como se debe llamar "mes"
     * @param anio Se le indica como se debe llamar "anio"
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * 
     * @return Regresa el valor de dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @return Regresa el valor de mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @return Regresa el valor de anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Metodo encargado de Cambiar el dia del Objeto Fecha.
     * @param dia Se crea el setDia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Metodo encargado de Cambiar el mes del Objeto Fecha.
     * @param mes Se crea el SetMes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * Metodo encargado de Cambiar el dia anio Objeto Fecha.
     * @param anio Se crea el setAnio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Metodo encargado de Imprimir todos los datos dentro del objeto fecha.
     * @return Regresa de forma de mensaje la informacion de dia, mes y anio
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + anio + '}';
    }
}
