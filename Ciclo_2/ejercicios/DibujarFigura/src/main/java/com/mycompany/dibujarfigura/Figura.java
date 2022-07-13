/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dibujarfigura;

/**
 *
 * @author USER
 */
public abstract class Figura {
    protected String color;
    public Figura(String color){
        this.color= color;
    }
    
    protected abstract double perimetro();
    
    public abstract double area();
}
