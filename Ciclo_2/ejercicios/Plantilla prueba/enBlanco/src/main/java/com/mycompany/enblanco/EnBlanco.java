/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.enblanco;

/**
 *
 * @author Benjamin Edaurdo Gaona H
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

import java.util.Scanner; 
import java.util.*;
public class Registro {
    private Scanner teclado;
    private int opcion;
    private String nivel;
    private String nombre;
    private int edad;
    private String programa;
    private String etnia;
    public int creditos;
    private String mod;
    private String pre;
    public void  registro(){
        String entrada;
        String[] elist;
        this.teclado=new Scanner(System.in);
        entrada = teclado.nextLine();
        elist= entrada.split("&");
        //System.out.println(entrada);
        opcion = Integer.parseInt(elist[0]);
        nivel= elist[1];
        nombre= elist[2];
        edad = Integer.parseInt(elist[3]);
        programa = elist[4];
        etnia= "nada";
        
        this.pre="Pregrado"; 
        if (this.nivel.equals(pre)){
             creditos= Integer.parseInt(elist[6]);
             //System.out.println("estudiante es " + opcion+" "+nivel+" "+nombre+" "+edad+" "+programa+" "+etnia+" "+creditos);
             Pregrado pregrado= new Pregrado(this.nombre,this.edad,this.programa,this.etnia,this.creditos);
             System.out.println(pregrado.nombre);
         }else{
            this.mod=elist[6];
            System.out.println("estudiante es " + opcion+" "+nivel+" "+nombre+" "+edad+" "+programa+" "+etnia+" "+mod);
         }
        
        
        //1&Pregrado&Luis Parra&21&Medicina&Raizal&15
    } 
   

    public static void main(String[] args) {
        
        //Pregrado pregrado= new Pregrado(this.nombre,this.edad,this.programa,this.etnia,this.creditos);
        Postgrado postgrado= new Postgrado("Ad",38,"psico","ninguna","investigacion");
        //System.out.println(pregrado.nombre);
        System.out.println("Hello World!");
        
    }
}
    



    
    

