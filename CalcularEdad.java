package Pruebas;
import java.util.Scanner;

/* Ejercicio propuesto 4.5.2: Crea un programa que pida al usuario su año de nacimiento y el año actual 
(suando datos de tipo short) y halle la diferencia de ambos para obtener su edad. */

public class CalcularEdad {
    public static void main (String[] args){

        int añoNac;
        int añoActual;
        Scanner teclado = new Scanner (System.in);

        System.out.print("Introduce el año en el que naciste: ");
        añoNac = teclado.nextInt();

        System.out.print("Introduce el año en el que estamos: ");
        añoActual = teclado.nextInt();

        int edad = añoActual-añoNac;
        System.out.println("Ahora mismo tienes " + edad + " años ");

    }
    
}
