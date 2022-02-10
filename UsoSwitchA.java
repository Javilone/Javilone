package Pruebas;
import java.util.Scanner;

/* Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes. 
Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre". */

public class UsoSwitchA {
    
    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);
        int mes;

        System.out.print("Introduce el número de mes:");
        mes = teclado.nextInt();

        switch (mes){
            case 1: System.out.println("El mes introducido es ENERO"); break;
            case 2: System.out.println("El mes introducido es FEBRERO"); break;
            case 3: System.out.println("El mes introducido es MARZO"); break;
            case 4: System.out.println("El mes introducido es ABRIL"); break;
            case 5: System.out.println("El mes introducido es MAYO"); break;
            case 6: System.out.println("El mes introducido es JUNIO"); break;
            case 7: System.out.println("El mes introducido es JULIO"); break;
            case 8: System.out.println("El mes introducido es AGOSTO"); break;
            case 9: System.out.println("El mes introducido es SEPTIEMBRE"); break;
            case 10: System.out.println("El mes introducido es OCTUBRE"); break;
            case 11: System.out.println("El mes introducido es NOVIEMBRE"); break;
            case 12: System.out.println("El mes introducido es DICIEMBRE"); break;
            default : System.out.println("Los años solo tienen 12 meses, eh"); break;
        }
    }
}
