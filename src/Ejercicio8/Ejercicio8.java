package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {


    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese un número: ");
            array[i] = entrada.nextInt();
        }
        
        // Pedir un número y una posición
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        System.out.print("Ingrese una posición: ");
        int posicion = entrada.nextInt();
        
        
        for (int i = 7; i >= posicion; i--) {
            array[i + 1] = array[i];
        }
        array[posicion] = numero;
        
        System.out.println("El array resultante es:");
        for (int i = 0; i < 9; i++) {
            System.out.println(array[i]);
        }
    }
}