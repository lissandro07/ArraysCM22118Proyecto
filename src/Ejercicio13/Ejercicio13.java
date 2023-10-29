
package ejercicio13;

import java.util.Scanner;
public class Ejercicio13 {

   
    public static void main(String[] args) {
        String[] nombresPokemonB = {
            "Venusaur",
            "Blastoise",
            "Dragonite",
            "Gyarados",
            "Alakazam",
            "Arcanine",
            "Lapras",
            "Golem",
            "Gyarados",
            "Rhydon"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero del 1 al 10 para saber que pokémon se encuentra en él índice: ");
        int index = scanner.nextInt();

        if (index >= 1 && index <= 10) {
            String nombrePokemon = nombresPokemonB[index - 1];
            System.out.println("El nombre del Pokémon en ese índice es: " + nombrePokemon);
        } else {
            System.out.println("El número ingresado está fuera del rango válido.");
        }
    }
}
