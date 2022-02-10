package Pruebas;
import java.util.Scanner;

/* Crea un programa que pida al usuario y diga si ese número es múltiplo de 3 
(pista: puedes utilizar la operación "módulo", el "resto de la división": %) */

public class CondicionesCinco {

    public static void main (String [] args){

        int numero;
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Introduce un número para probar si es múltiplo de 3, o no:");
        numero = teclado.nextInt();

        if (numero%3 == 0 ) {
            System.out.println("Parece ser que tu número es múltiplo de 3. Genial!");
        }
        else {
            System.out.println("Tu número no es múltiplo de 3. Prueba otro.");
        }        
    }
}
