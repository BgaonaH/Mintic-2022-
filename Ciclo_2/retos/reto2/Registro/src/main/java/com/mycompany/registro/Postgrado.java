/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro;

/**
 *
 * @author USER
 */
public class Postgrado extends Estudiante {
    private String mod;
    public Postgrado(String nombre,int edad,String programa,String etnia, String mod) {
	super(nombre, edad,programa,etnia);
        this.mod= mod;
    }
    public String toString(){
        String output = "\t  Estudiante Posgrado";
        output +=  super.toString();
        output += "\n \t  Modalidad: "+this.mod;
        return output;
    }
}
