package ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) {

            String[] nombresPokemonA = {
                "Pikachu",
                "Charizard",
                "Bulbasaur",
                "Squirtle",
                "Jigglypuff",
                "Eevee",
                "Mewtwo",
                "Snorlax",
                "Gengar",
                "Machamp"
            };
                
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
if(nombresPokemonA.length != nombresPokemonB.length)
            {
               System.out.println("Los dos arraglos no tienen el mimso tamaño");
            }
            else
            {
                String[] nombresPokemonC = new String[nombresPokemonA.length];
               
                for(int i = 0; i < nombresPokemonC.length; i++){
                    nombresPokemonC[i] = nombresPokemonA[i] + " " + nombresPokemonB[i];
                }
                
                
                for(int i = 0; i < nombresPokemonC.length; i++){
                    System.out.println("Este sera A: " + i +" y B: " + i + " " + nombresPokemonC[i]); 
    }
  }
   }
}
