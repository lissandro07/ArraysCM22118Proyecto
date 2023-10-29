
package Ejercicio7;


import java.util.Scanner;
public class Ejercicio7 {


    public static void main(String[] args) {int[] numeros = new int[10];

      Scanner scanner = new Scanner(System.in);

System.out.println("Ingrese los 10 números enteros:");

for (int i = 0; i < 10; i++) {
    System.out.print("Número " + (i + 1) + ": ");
    numeros[i] = scanner.nextInt();
}
boolean creciente = true;
boolean decreciente = true;

for (int i = 0; i < 9; i++) {
    if (numeros[i] > numeros[i + 1]) {
        creciente = false;
    }
    
    if (numeros[i] < numeros[i + 1]) {
        decreciente = false;
    }
}

if (creciente) {
    System.out.println("La serie está ordenada de forma creciente.");
} else if (decreciente) {
    System.out.println("La serie está ordenada de forma decreciente.");
} else {
    System.out.println("La serie está desordenada.");
}

    }
    
}