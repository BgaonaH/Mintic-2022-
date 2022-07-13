/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nota;

/**
 *
 * @author USER
 */
public abstract class Materia {
    private double reto1;
    protected double reto2;
    protected double reto3;
    protected double reto4;
    protected double reto5;
    protected double ing;
    protected double hp;
    
    public Materia(double reto1,double reto2,double reto3,double reto4,double reto5,double ing,double hp){
        this.reto1= reto1;
        this.reto2= reto2;
        this.reto3= reto3;
        this.reto4= reto4;
        this.reto5= reto5;
        this.ing= ing;
        this.hp= hp;
    }
    
    
    
    protected abstract double NotaP();
    protected abstract double NotaIng();
    protected abstract double NotaHP();
    
    public String toString(){
        return "\n \t  Reto1: "+this.reto1+"\n \t  Reto2: "+this.reto2+
                "\n \t  Reto3: "+this.reto3+"\n \t  Reto4: "+this.reto4+"\n \t "
                + " Reto5: "+this.reto5+"\n \t  Ing: "+this.ing+"\n \t  Habilidades Personales: "+this.hp;
    } 

    public double getReto1() {
        return reto1;
    }

    public void setReto1(double reto1) {
        this.reto1 = reto1;
    }

   
    
}
