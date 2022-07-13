/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1ciclo2;

/**
 *
 * @author Benjamín Eduardo Gaona
 */
import java.util.Scanner;
public class Reto1Ciclo2 {
    private Scanner teclado;
    private int dcg; //Distancia a la casa de Goku.
    private int dpe; //Distancia a la proxima esfera.
    private int tdv; //tiempo de viaje.
    private String esfera;//esfera que se busca.
    public void cargar(){
        teclado=new Scanner(System.in);
        dcg = teclado.nextInt();
    }
    public void operar(){
        dpe = (dcg*2)+4;
        tdv = (dcg+dpe)/5;
        if( tdv > 0 && tdv <= 20 ){ 
            esfera = "uno";
        } else if(tdv > 20 && tdv <= 30 ){
            esfera = "dos";
        }else if(tdv > 30 && tdv <= 50 ){
            esfera = "tres";
        }else {
            esfera = "cuatro";
        }
    }
    public void imprimir(){
        System.out.println(dcg + " " + dpe + " " + tdv );
        System.out.println(esfera);
    }
    public static void main(String[] args) {
        Reto1Ciclo2 rt1=new Reto1Ciclo2();
        rt1.cargar();
        rt1.operar();
        rt1.imprimir();
    }
}
