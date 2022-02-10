package Pruebas;
import java.util.Scanner;

public class Farenheit {
    
    public static void main (String [] args){

        // (25 °F − 32) × 5 / 9 = -3,889 °C

        try (Scanner teclado = new Scanner (System.in)) {
            int num1;

            System.out.print("Introduce los grados Farenheit que quieres convertir a Celsius: ");
      
            num1 = teclado.nextInt();
            float celsius = ((num1-32)*5)/9f;

            System.out.print(num1 + " grados Farenheit en Celsius equivale a " + celsius + " grados celsius.");
        }
    }
}
