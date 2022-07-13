/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.persona;

/**
 *
 * @author USER
 */
import java.text.DecimalFormat;
public class Persona {
    public String nombre;
    public int edad;
    public String genero;
    public double peso;
    public Double altura;
    public DecimalFormat f = new DecimalFormat("#.00");
    
    Persona(String nombre,int edad, String genero,double peso,Double altura) {
        this.nombre= nombre;
        this.edad= edad;
        this.genero= genero;
        this.peso=  peso;
        this.altura= altura;}
    public void calcularIMC(){
        double imc;
        imc = this.peso / (this.altura* this.altura);
        System.out.println("El imc  es "+f.format(imc));
    }
    public void esMayorDeEdad(){
        if (this.edad > 18){
            System.out.println("Es mayor de edad");
        }
    }
    public void aCadena(){
        System.out.println("Esta persona se llama "+this.nombre+" su edad es "+this.edad+" su peso es "+this.peso);
        System.out.println("su altura es "+this.altura);
    }
    public static void main(String[] args) {
        Persona unaPersona = new Persona("Paola",35,"M",68,1.65);
        unaPersona.aCadena();
        unaPersona.calcularIMC();
        unaPersona.esMayorDeEdad();
        
    }
}