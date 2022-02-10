package Pruebas;
import java.util.Scanner;

public class BasePorAltura {
    // (S = B*A/2)

    public static void main (String [] args){

    int base;
    int altura;
    Scanner teclado = new Scanner(System.in);

    System.out.println("================");
    System.out.print("Introduce la altura del triángulo: ");
    base = teclado.nextInt();
    System.out.print("Introduce la base del triángulo: ");
    altura = teclado.nextInt();

    int superficie = (base*altura) / 2;

    System.out.println("Al multiplicar la base " + base + " por la altura " + altura + " y dividirla entre dos, la superficie es " + superficie);
    System.out.println("================");
    
    }
}

