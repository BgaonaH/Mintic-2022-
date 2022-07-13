/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.perro;

/**
 *
 * @author USER
 */
public class Perro {
// Atributos
    public int edad;
    public String nombre;
    public String colorOjos;
// Constructor
    Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }
// M ́etodos
    public void ladrar() {
        System.out.println("Guau Guau");
    }
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
    public static void main(String[] args) {
        Perro miPerro = new Perro(5, "Toby", "Azul");
        System.out.println(miPerro.edad);
        miPerro.saludar();
    }
}
