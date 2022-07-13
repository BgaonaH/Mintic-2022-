/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro;

/**
 *
 * @author USER
 */
public abstract class Estudiante {
    protected String nombre;
    protected int edad;
    protected String programa;
    protected String etnia;
            
    public Estudiante(String nombre,int edad,String programa,String etnia){
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.etnia = etnia;
    };
    public String toString(){
        return "\n \t  Nombre: "+this.nombre+"\n \t  Edad: "+this.edad+" anios "+"\n \t  Programa: "+this.programa+"\n \t  Etnia: "+this.etnia;
    }   
}
