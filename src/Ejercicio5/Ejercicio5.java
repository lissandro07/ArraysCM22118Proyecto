package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese el tamaño del array: ");
int size = scanner.nextInt();

int[] array = new int[size];

System.out.println("Ingrese los números del array:");
for (int i = 0; i < size; i++) {
    System.out.print("Número " + (i + 1) + ": ");
    array[i] = scanner.nextInt();
}

scanner.close();

int max = array[0];
int min = array[0];
for (int i = 1; i < size; i++) {
    if (array[i] > max) {
        max = array[i];
    }
    if (array[i] < min) {
        min = array[i];
    }
}

System.out.println("Valor máximo: " + max);
System.out.println("Valor mínimo: " + min);

    }
    
}
