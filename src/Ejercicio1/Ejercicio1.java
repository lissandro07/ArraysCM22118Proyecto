
package Ejercicio1;


import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Los números introducidos son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}