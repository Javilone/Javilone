package Pruebas;
import java.util.Scanner;

// Crea un programa que pida dos números reales al usuario y diga cuál es el mayor de ellos.

public class CondicionesCuatro {
    
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);
        double num1;
        double num2;

        System.out.print("Introduce un número decimal:");
        num1 = teclado.nextDouble();
        System.out.print("Introduce otro número decimal:");
        num2 = teclado.nextDouble();

        if (num1 > num2){
            System.out.println("El número mayor es " + num1 + ".");
        }
        if (num2 > num1){
            System.out.println("El número mayor es " + num2 + ".");
        }
        if (num1 == num2){
            System.out.println("Has escrito dos veces el mismo número!!");
        }
    }
}
