
package ejercicio15;

import java.util.Scanner;
public class Ejercicio15 {

 
    public static void main(String[] args) {
        String[] nombresPokemon = {"pikachu", "charizard", "bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un Pokémon: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad de poder: ");
        int poder = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < nombresPokemon.length; i++) {
            if (nombresPokemon[i].equalsIgnoreCase(nombre)) {
                poderesPokemon[i] = poder;
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El poder del Pokémon " + nombre + " ha sido actualizado.");
        } else {
            System.out.println("El Pokémon " + nombre + " no fue encontrado.");
        }
    }
}