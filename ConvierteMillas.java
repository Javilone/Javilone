package Pruebas;
import java.util.Scanner;

/* Ejercicio propuesto 4.5.4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) 
y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km). */

public class ConvierteMillas {
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);
        float millas;

        System.out.print("¿Cuantas millas quieres convertir a kilómetros:");
            millas = teclado.nextFloat();
    
        float km = millas*1.609f;

        System.out.println(millas + " millas en kilómetros equivale a " + km + "km.");
    }
}
