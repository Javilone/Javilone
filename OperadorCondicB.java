package Pruebas;
import java.util.Scanner;

/* Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", 
que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y 
luego con un "operador condicional" */

public class OperadorCondicB {
    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);
        byte num1;
        byte num2;
        byte num3;

        System.out.println("Te voy a decir cual de dos números es el menor.");
        System.out.print("Introduce tu primer número corto:");
        num1 = teclado.nextByte();
        System.out.print("Introduce tu segundo número corto:");
        num2 = teclado.nextByte();

        num3 = num1>num2 ? num2 : num1;

        System.out.println(num3);
    }
}
