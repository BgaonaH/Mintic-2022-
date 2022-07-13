/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.promedionotas;

/**
 *
 * @author Benjamín Eduardo Gaona.
 */
import java.util.Scanner;
import java.util.Locale; //esto es para poder meter decimales con punto ejem 3.0 y que no se rompa el codigo si no debes meterlo asi 3,0
//esto pasa por que en español los decimales se meten con coma.
import java.text.DecimalFormat; //con esto podemos limitar la cantidd de deciameles
import java.util.InputMismatchException;
public class PromedioNotas { // este EnBlanco es el nombre de la clase pricipal.
    private Scanner teclado;
    private String[] nombres;
    private Double[] reto1;
    private Double[] reto2;
    private Double[] reto3;
    private Double[] reto4;
    private Double[] reto5;
    private Double[] hp;
    private Double[] ing;
    private int c; //Esta variable es para delimitar el numero de estudiantes que vamos a evaluar se utilizara en varios de los metodos que creamos.
    private double promedio;
    private double estadistica1;
    private double estadistica2;
    private double estadistica3;
    private DecimalFormat f = new DecimalFormat("#.00"); //con esta variable delimitamos la cantidad de decimales. 
    
    public void cargar() {
        this.teclado=new Scanner(System.in).useLocale(Locale.ENGLISH); //con esta variable determinamos que los decimales entraran con punto.
        boolean continua;
        do{//Filtra para que se ingrese solo valores enteros.
            try{
                continua =false;
                System.out.print("Ingrese el numero de estudiantes a evaluar ");
                c = teclado.nextInt(); //Esta variable pide el numero de estudiantes a evaluar,  
            }catch(InputMismatchException ex){
                System.out.println("Debe ingresar un numero entero ");
                teclado.next();
                continua = true;
            }    
        }while(continua);
        nombres=new String[c];
        reto1=new Double[c];
        reto2=new Double[c];
        reto3=new Double[c];
        reto4=new Double[c];
        reto5=new Double[c];
        hp=new Double[c];
        ing=new Double[c];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese nombre del estudiante numero "+(f+1)+" ");
            nombres[f]=teclado.next();
            do{//Filtra para que se ingrese solo valores enteros.
                try{continua =false;
                System.out.print("reto1: "); 
                reto1[f]=teclado.nextDouble();
                while(reto1[f] < 0 || reto1[f] > 5){
                        System.out.print("Nota no valida, ingrese la nota en escala de 0 a 5: ");
                        reto1[f] = teclado.nextDouble();
                    }
                System.out.print("reto2: ");
                reto2[f]=teclado.nextDouble();
                while(reto2[f] < 0 || reto2[f] > 5){
                        System.out.print("Nota no valida, ingrese la nota en escala de 0 a 5: ");
                        reto2[f] = teclado.nextDouble();
                    }
                System.out.print("reto3: ");
                reto3[f]=teclado.nextDouble();
                while(reto3[f] < 0 || reto3[f] > 5){
                        System.out.print("Nota no valida, ingrese la nota en escala de 0 a 5: ");
                        reto3[f] = teclado.nextDouble();
                    }
                System.out.print("reto4: ");
                reto4[f]=teclado.nextDouble();
                while(reto4[f] < 0 || reto4[f] > 5){
                        System.out.print("Nota no valida, ingrese la nota en escala de 0 a 5: ");
                        reto4[f] = teclado.nextDouble();
                    }
                System.out.print("reto5: ");
                reto5[f]=teclado.nextDouble();
                while(reto5[f] < 0 || reto5[f] > 5){
                        System.out.print("Nota no valida, ingrese la nota en escala de 0 a 5: ");
                        reto5[f] = teclado.nextDouble();
                    }
                System.out.print("Habilidades personales: ");
                hp[f]=teclado.nextDouble();
                while(hp[f] < 0 || hp[f] > 5){
                        System.out.print("Nota no valida, ingrese la nota en escala de 0 a 5: ");
                        hp[f] = teclado.nextDouble();
                    }
                System.out.print("Ingles: ");
                ing[f]=teclado.nextDouble(); 
                while(ing[f] < 0 || ing[f] > 5){
                        System.out.print("Nota no valida, ingrese la nota en escala de 0 a 5: ");
                        ing[f] = teclado.nextDouble();
                    }
                    }catch(InputMismatchException ex){
                System.out.println("Debe ingresar numeros entre 0 y 5 ");
                teclado.next();
                continua = true;
                }    
            }while(continua);
        }
    }    
    public void promedioT() {
        double promedioEst[]=new double[c]; // Este vector  almacena de forma local el promedio individual de los Estudiantes.
        double promedioT[]=new double[c];// Este vector  almacena de forma local el promedio total de los Estudiantes.
        double suma = 0 ;
        double reto1T = 0;
        double reto2T = 0;
    	for(int f=0;f<nombres.length;f++) {// Calcula promedio individual.
            promedioEst[f]= ((reto1[f]*10)/100 +(reto2[f]*10)/100+(reto3[f]*20)/100+(reto4[f]*20)/100+(reto5[f]*20)/100+(hp[f]*10)/100+(ing[f]*10)/100);
            
    	}
        for (int i = 0; i < nombres.length; i++) {// Calcula promedio total.
            suma+=promedioEst[i];
        }
        promedio=suma/nombres.length;   //se almacena en esta variable Global los resultados
        
        for (int e = 0; e < nombres.length; e++) {// Calcula promedio total.
            reto1T+= reto1[e];
            reto2T+= reto2[e];
        }
        estadistica1 = ((reto1T/nombres.length)+(reto2T/nombres.length))/2+10;
        estadistica2 = estadistica1+(estadistica1*30/100);
        estadistica3= (estadistica1*4)+(estadistica2*20/100);
    }
    public void imprimir(){//aca se imprimira todos los resultados, recuerden que para poder imprimir aca debe estar asginado como private.
        System.out.println("el promedio total de los estudiantes  " + f.format(promedio));
        System.out.println("La estadistica 1 es:                  " + f.format(estadistica1));
        System.out.println("La estadistica 2 es:                  " + f.format(estadistica2));
        System.out.println("La estadistica 3 es:                  " + f.format(estadistica3));
        
    }
    public static void main(String[] ar) {
        PromedioNotas pv=new PromedioNotas(); // pv es como vamos a tratar la clase.
        pv.cargar();
        pv.promedioT();
        pv.imprimir();   
    }  
}
