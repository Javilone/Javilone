package Pruebas;
import java.util.Scanner;

/*Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese número es par 
o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional". */

public class OperadorCondic {
    public static void main (String args []){
        
        Scanner teclado = new Scanner(System.in);
        int par;

        System.out.print("Introduce un número entero:");
        par = teclado.nextInt();

        par = par%2 == 0 ? 1 : 0 ;
        System.out.println(par);
    }    
}
