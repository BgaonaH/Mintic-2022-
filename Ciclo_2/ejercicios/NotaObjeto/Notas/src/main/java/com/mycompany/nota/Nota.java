/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nota;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Nota {
    public void cargar(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el numero de Estudiantes:");
        int num = sc.nextInt();
        
        double sumatoria = 0;
        
        
        for (int i = 0;i < num ;i++){
        System.out.println("Digite el nombre de el Estudiante:");
        String n = sc.next();
        
       
        System.out.println("Reto 1");
        double r1 = sc.nextDouble();
        System.out.println("Reto 2");
        double r2 = sc.nextDouble();
        System.out.println("Reto 3");
        double r3 = sc.nextDouble();
        System.out.println("Reto 4");
        double r4 = sc.nextDouble();
        System.out.println("Reto 5");
        double r5 = sc.nextDouble();
        System.out.println("Ingles");
        double ing = sc.nextDouble();
        System.out.println("Habilidades");
        double hp = sc.nextDouble();
        
        Estudiante estudiante= new Estudiante(n,r1,r2,r3,r4,r5,ing,hp);
        
        estudiante.NotaP();
        System.out.println("---------------------");
        System.out.println("Estudiante: " + n);
        System.out.println(estudiante);
        System.out.println("");
        System.out.println("La nota de programacion es: "+estudiante.NotaP());
        System.out.println("La nota de Ingles es: "+estudiante.NotaIng());
        System.out.println("La nota de Habilidades personales es: "+estudiante.NotaHP());
        System.out.println("La nota promedio es : "+estudiante.NotaProm());
        sumatoria = sumatoria + estudiante.NotaProm();
        System.out.println("---------------------");
        } 
        System.out.println("La nota promedio de los estudiantes es : " + (sumatoria/num));
                
    }
 
    public static void main(String[] args) {
         
        
        Nota n= new Nota();
        n.cargar();
        
    }
}
