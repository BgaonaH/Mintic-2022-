import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int juan = 0, mateo, andres;
        Scanner reader = new Scanner(System.in);
        String serie;
        juan = reader.nextInt(); //new Scanner(System.in);
        mateo = (juan * 2) + 4;
        andres = (juan+mateo); // 5  
        serie = " ";
        if (andres <= 20){
            serie = "uno";   
        } 
        else if (andres >= 21 & andres <= 30){
            serie = "dos";
        }else if (andres >= 31 & andres <= 50){
            serie = "tres";
        } else if (andres > 51){
            serie = "cuatro"; 
        }
        System.out.println(juan+" "+ mateo+" "+andres+" "+serie);	
    }
}
