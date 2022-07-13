/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registro;

/**
 *
 * @author USER
 */

import java.util.Scanner; 
import java.util.*;
public class Registro {
    private String nombre;
    private Estudiante[] estudiantes;
    private int ultimo;
    
    
    public Registro(String nombre){
        this.nombre = nombre;
        this.estudiantes = new Estudiante[100];
        this.ultimo = 0;
    }
    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes[ultimo] = estudiante;
        this.ultimo++;
    }
    public void inventario(){
            System.out.println("***Listado de estudiantes***");
        for(int i =0; i < ultimo; i++){
            System.out.println(this.estudiantes[i]);
        }
    }
     public int procesarComando(String comando){
        String[] elist = comando.split("&");
        int opcion = Integer.parseInt(elist[0]);
        switch(opcion){
            case 1:
                String nivel = elist[1];
                String nombre = elist[2];
                String programa = elist[4];
                String etnia = elist[5];
                String mod;
                int edad = Integer.parseInt(elist[3]);
                int creditos;
                 
                if (nivel.equals("Pregrado")){
                    creditos= Integer.parseInt(elist[6]);
                    //System.out.println("estudiante es " + opcion+" "+nivel+" "+nombre+" "+edad+" "+programa+" "+etnia+" "+creditos);
                    //Pregrado pregrado= new Pregrado(this.nombre,this.edad,this.programa,this.etnia,this.creditos);
                    //System.out.println(pregrado.nombre);
                    Pregrado e = new Pregrado(nombre,edad,programa,etnia,creditos);
                    this.agregarEstudiante(e);
                }
                else{
                    mod=elist[6];
                    //System.out.println("estudiante es " + opcion+" "+nivel+" "+nombre+" "+edad+" "+programa+" "+etnia+" "+mod);
                     Postgrado e = new Postgrado(nombre,edad,programa,etnia,mod);
                     this.agregarEstudiante(e);
                }        
                break;
            case 2:
                inventario();
                break;
            case 3:
                System.exit(0);
                break;        
        }
        return opcion;
    }
  
  
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registro registro = new Registro("Unal");
        
        int opc; 
        do {
            String linea = sc.nextLine();
            opc = registro.procesarComando(linea);
            
        } while(opc != 100);
        
    }
}
