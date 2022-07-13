/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop3;

/**
 *
 * @author usuario1
 */
public class Persona {
    //Atributos
    public String nombre;
    public int edad;
    public String genero;
    public double altura;
    public double peso; 
            
    //Constructor
    public Persona(String name, int age,String gender, double height, double weight){
        if(gender.equalsIgnoreCase("hombre")){
            this.genero="H";
        }else if(gender.equalsIgnoreCase("Mujer")){
            this.genero="M";
        }else{
            this.genero=gender;
        }
        this.nombre=name;
        this.edad=age;
        this.peso= weight;
        this.altura= height;          
    }
    //metodos      
    public double calcularIMC(){
      //  return (this.peso/(Math.pow(this.peso, 2)));
        return (this.peso/(this.altura*this.altura));
    }
    public boolean esMayorDeEdad(){
       /*return (this.edad >= 18) ? "La persona " + this.nombre + " es mayor de edad" :
          "La persona " + this.nombre + " es menor de edad";*/
       return (this.edad>=18);
    }
    public void aCadena(){
        System.out.println("Esta persona se llama "+this.nombre+" su edad es "+this.edad+" su peso es "+this.peso);
        System.out.println("su altura es "+this.altura+" su genero es "+this.genero);
    }
    public static void main(String[]args){
        Persona juan= new Persona("juan",18,"HoMbRe",1.80,80);
        juan.calcularIMC();
        juan.esMayorDeEdad();
        juan.aCadena();
        System.out.println(juan.esMayorDeEdad());
        System.out.println(juan.calcularIMC());
    }
            
}
