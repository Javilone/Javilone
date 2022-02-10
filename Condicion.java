package Pruebas;
import java.util.Scanner;

// Ejercicio propuesto 5.1.1: Crea un programa que pida un número al usuario y diga si es positivo (mayor que cero).

public class Condicion {
    
    public static void main (String [] args){
       
        int numero;
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        if (numero > 0){
            System.out.println("El número que has escrito es POSITIVO.");
        }

        else {
            System.out.println("El número que has escrito es NEGATIVO.");
        }

    }
}
