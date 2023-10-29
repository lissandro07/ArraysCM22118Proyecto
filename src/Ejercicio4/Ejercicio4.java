package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        String[] nombres = new String[5];
        Scanner scanner = new Scanner(System.in);

        // Leer los nombres de Pokémon
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre del Pokémon " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los nombres en orden inverso
        System.out.println("Los nombres de Pokémon en orden inverso son:");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println(nombres[i]);
        }
    }
}