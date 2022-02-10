package Pruebas;
import java.util.Scanner;

/* Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero), 
si es negativo (menor que cero) o si, por el contrario, es exactamente 0 
(necesitarás enlazar 2 "if" uno tras otro). */

public class CondicionesTres {
    
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);
        int numero;

        System.out.println("Introduce un número entero y veremos si es positivo, o no");
        System.out.print("(Prueba también el 0!:)");

        numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número que has puesto es POSITIVO!");
        }
        if (numero < 0) {
            System.out.println("El número que has puesto es NEGATIVO");
        }
        if (numero == 0) {
            System.out.println("El número que has puesto es el CERO");
        }
        }
    }

