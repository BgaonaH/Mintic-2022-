import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String nombre;
        Double nota1,nota2,nota3,nota4,nota5,nota6, nota7;
        List primerEstudiante = new ArrayList();
        Scanner rd = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Con este aplicatvo se promediara las notas de 5 estudiantes.");

        for(int i=0; i<=4; i++){
        System.out.println("---Introduce el nombre del estudiante numero " + (i+1));
        nombre = rd.next();
        System.out.println("Introduce la nota del reto 1.");
        nota1 = rd.nextDouble();
        System.out.println("Introduce la nota del reto 2.");
        nota2 = rd.nextDouble();
        System.out.println("Introduce la nota del reto 3.");
        nota3 = rd.nextDouble();
        System.out.println("Introduce la nota del reto 4.");
        nota4 = rd.nextDouble();
        System.out.println("Introduce la nota del reto 5.");
        nota5 = rd.nextDouble();
        System.out.println("Introduce la nota del Habilidades personales.");
        nota6 = rd.nextDouble();
        System.out.println("Introduce la nota de Ingles.");
        nota7 = rd.nextDouble();
       
        primerEstudiante.add(nombre);
        primerEstudiante.add(((nota1*10)/100) + ((nota2*10)/100) + ((nota3*20)/100) + ((nota4*20)/100) +((nota5*20)/100) + ((nota6*10)/100) + ((nota7*10)/100));
        };
        
       
        
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("Las nota final de " + primerEstudiante.get(0) + " es " + formato1.format(primerEstudiante.get(1)) ); 
        System.out.println("Las nota final de " + primerEstudiante.get(2) + " es " + formato1.format(primerEstudiante.get(3)) ); 
        System.out.println("Las nota final de " + primerEstudiante.get(4) + " es " + formato1.format(primerEstudiante.get(5)) ); 
        System.out.println("Las nota final de " + primerEstudiante.get(6) + " es " + formato1.format(primerEstudiante.get(7)) ); 
        System.out.println("Las nota final de " + primerEstudiante.get(8) + " es " + formato1.format(primerEstudiante.get(9)) ); 
        //System.out.println(primerEstudiante);

    }
}
