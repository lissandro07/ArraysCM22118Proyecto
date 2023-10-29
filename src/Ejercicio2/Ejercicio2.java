
package Ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int sumaPositivos = 0;
        int contadorPositivos = 0;
        int sumaNegativos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        double mediaPositivos = (double) sumaPositivos / contadorPositivos;
        double mediaNegativos = (double) sumaNegativos / contadorNegativos;

        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Número de ceros: " + contadorCeros);
    }
}