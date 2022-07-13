
package com.mycompany.nota;

/**
 *
 * @author nunez
 */
public class Estudiante extends Materia {
    private String nombreEst;
    
    public Estudiante(String nombreEst, double reto1,double reto2,double reto3,double reto4,double reto5,double ing,double hp) {
	super(reto1,reto2,reto3,reto4,reto5,ing,hp);
        this.nombreEst= nombreEst;
    }
    protected double NotaP(){
        double notaP=((reto1*11)/100 +(reto2*11)/100+(reto3*26)/100+(reto4*26)/100+(reto5*26)/100);
        return notaP;
    }

    protected double NotaIng() {
        double notaIng = ing;
        return notaIng;
    }

    protected double NotaHP() {
        return hp;
    }

    protected double NotaProm() {
        return ((reto1*0.1)+(reto2*0.1)+(reto3*0.2)+(reto4*0.2)+(reto5*0.2)+(ing*0.1)+(hp*0.1));
    }
    
}