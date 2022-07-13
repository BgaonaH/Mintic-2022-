/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dibujarfigura;

/**
 *
 * @author USER
 */
public class Triangulo extends Figura {
    protected double altura;
    protected double base;
    public Triangulo(double altura,double base, String color){
        super(color);
        this.altura=altura;
        this.base=base;
    }
    protected double perimetro(){
        return 2*Math.PI*this.radio;
    };
    public double area(){
        return Math.PI*(this.radio*this.radio);
    };
}
