
package ejercicio9;

import java.util.Scanner;
public class Ejercicio9 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingresa los 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        int ultimo = numeros[9];
        for (int i = 9; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        System.out.println("Array desplazado una posición hacia abajo:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}