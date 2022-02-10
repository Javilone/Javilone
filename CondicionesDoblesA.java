package Pruebas;
import java.util.Scanner;

// Crea un programa que pida al usuario dos números enteros y diga si los dos son positivos (el primero Y el segundo)

public class CondicionesDoblesA {
    
    public static void main (String [] args){
        
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Vas a introducir dos números y comprobaré que ambos sean positivos");
        System.out.print("Introduce el primer número:");
        num1 = teclado.nextInt();

        System.out.print("Ahora escribe el segundo número:");
        num2 = teclado.nextInt();

        if ((num1>0) && (num2>0)){
            System.out.println("Los dos números eran positivos!");
        }
        else {
            System.out.println("Uno de los números no era positivo, y lo sabes!");
        }
    }
}
