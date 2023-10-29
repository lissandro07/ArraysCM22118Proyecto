
package Ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer los números enteros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en el orden especificado
        System.out.println("Los números en el orden especificado son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i] + " " + numeros[9 - i]);
        }
    }
}