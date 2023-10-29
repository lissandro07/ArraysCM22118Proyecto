
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {
        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese los 5 elementos numéricos ordenados de forma creciente:");
for (int i = 0; i < 5; i++) {
    array[i] = scanner.nextInt();
}
System.out.println("Ingrese el número N a insertar:");
int numeroN = scanner.nextInt();
int posicion = 0;
while (posicion < 5 && numeroN > array[posicion]) {
    posicion++;
}

for (int i = 4; i >= posicion; i--) {
    array[i + 1] = array[i];
}

array[posicion] = numeroN;
System.out.println("El array resultante es:");
for (int i = 0; i < 6; i++) {
    System.out.println(array[i]);
}

      
    }
    
}
