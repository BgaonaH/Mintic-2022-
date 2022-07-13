/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro;

/**
 *
 * @author USER
 */
public class Pregrado extends Estudiante {
    private int creditos;
    public Pregrado(String nombre,int edad,String programa,String etnia,int creditos) {
	super(nombre, edad,programa,etnia);
        this.creditos= creditos;
    }
    public String toString(){
        String output = "\t  Estudiante Pregrado";
        output +=  super.toString();
        output += "\n \t  Creditos aprobados: "+this.creditos;
        return output;
    }
}
