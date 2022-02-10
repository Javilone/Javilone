package Pruebas;
import java.util.Scanner;

// Crea un programa que diga si el número introducido por el usuario es impar o no lo es.
public class CondicionesSeis {

    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);
        int num;

        System.out.print("Introduce un número entero y veamos si es par o impar:");
        num = teclado.nextInt();

        if (num%2 == 0 ) {
            System.out.println("Tu número es par.");
        }
        else {
            System.out.println("Tu número es impar.");
        }
    }
}
