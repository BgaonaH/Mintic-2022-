/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dibujarfigura;

/**
 *
 * @author USER
 */
public class Circulo extends Figura {
    protected double radio;
    
    public Circulo(double radio, String color){
        super(color);
        this.radio=radio;
    }
    protected double perimetro(){
        return 2*Math.PI*this.radio;
    };
    public double area(){
        return Math.PI*(this.radio*this.radio);
    };
}
