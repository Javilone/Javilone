package Pruebas;
import java.util.Scanner;

// Crea un programa que pida al usuario que introduzca el número 12. 
// Después debe decirle si lo ha hecho correctamente o no.

public class CondicionesDos {
    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);
        int doce;
        
        System.out.print("Escribe el número 12: ");
        doce = teclado.nextInt();

        if (doce == 12){
            System.out.println("Bien hecho, lo has escrito bien!");
        }
        else {
            System.out.println("No es el número que te he pedido!");
        }

    }
}
