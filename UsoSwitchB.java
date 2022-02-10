package Pruebas;
import java.util.Scanner;

/* Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario. 
Por ejemplo, si el usuario introduce 3, deberá escribir "tres". */

public class UsoSwitchB {
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);
        int mes;

        System.out.println("Escribe un número del 1 al 6 y te diré cómo se escribe con letras:");
        mes = teclado.nextInt();
    
        switch (mes){
            case 1: System.out.println( mes + " se escribe así: UNO"); break;
            case 2: System.out.println( mes + " se escribe así: DOS"); break;
            case 3: System.out.println( mes + " se escribe así: TRES"); break;
            case 4: System.out.println( mes + " se escribe así: CUATRO"); break;
            case 5: System.out.println( mes + " se escribe así: CINCO"); break;
            case 6: System.out.println( mes + " se escribe así: SEIS"); break;
            default: System.out.println("Te dije un número del 1 al 6!"); break;
        }
    }
}
