
package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el elemento en la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese la posición a eliminar (entre 0 y 9): ");
        int posicion = scanner.nextInt();
        

        for (int i = posicion; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        
        System.out.println("Array resultante:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + array[i]);
        }
    }
}
