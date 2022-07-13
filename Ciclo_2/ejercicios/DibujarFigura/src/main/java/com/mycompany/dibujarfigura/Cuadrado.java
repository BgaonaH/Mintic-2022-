/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dibujarfigura;

/**
 *
 * @author USER
 */
public class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado, String color){
        super(color);
        this.lado=lado;
    }
    protected double perimetro(){
        return this.lado*4;
    };
    public double area(){
        return this.lado*this.lado;
    };
}
