
package ejercicio12;

import java.util.Scanner;
public class Ejercicio12 {


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
        System.out.print("Ingrese el nombre de un Pokémon: ");
        String nombrePokemon = scanner.nextLine();

        int indice = -1;
        for (int i = 0; i < nombresPokemonB.length; i++) {
            if (nombresPokemonB[i].equalsIgnoreCase(nombrePokemon)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.println("El Pokémon se encontró en el índice: " + indice);
        } else {
            System.out.println("El Pokémon no se encontró en el array.");
        }
    }
}