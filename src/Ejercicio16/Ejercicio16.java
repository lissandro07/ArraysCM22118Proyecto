
package ejercicio16;


public class Ejercicio16 {

   
    public static void main(String[] args) {
        String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur", "Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};
        
        int indiceMaximoPoder = 0;
        int maximoPoder = poderesPokemon[0];
        
        for (int i = 1; i < poderesPokemon.length; i++) {
            if (poderesPokemon[i] > maximoPoder) {
                maximoPoder = poderesPokemon[i];
                indiceMaximoPoder = i;
            }
        }
        
        String nombrePokemonMaximoPoder = nombresPokemon[indiceMaximoPoder];
        System.out.println("El Pokémon con la mayor cantidad de poder es: " + nombrePokemonMaximoPoder);
    }
}