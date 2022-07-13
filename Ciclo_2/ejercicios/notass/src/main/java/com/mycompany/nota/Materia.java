
package com.mycompany.nota;

/**
 *
 * @author nunez
 */
public abstract class Materia {
    public double reto1;
    public double reto2;
    public double reto3;
    public double reto4;
    public double reto5;
    public double ing;
    public double hp;
    
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
    protected abstract double NotaProm();
    
    public String toString(){
        return "\n \t  Reto1: "+this.reto1+"\n \t  Reto2: "+this.reto2+
                "\n \t  Reto3: "+this.reto3+"\n \t  Reto4: "+this.reto4+"\n \t "
                + " Reto5: "+this.reto5+"\n \t  Ing: "+this.ing+"\n \t  Habilidades Personales: "+this.hp;
    } 
}
