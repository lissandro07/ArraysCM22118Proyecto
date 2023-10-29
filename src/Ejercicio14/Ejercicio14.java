
package ejercicio14;
import java.util.Arrays;
public class Ejercicio14 {

    
    public static void main(String[] args) {
        int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98, 45};
        
        System.out.println("Arreglo desordenado: " + Arrays.toString(numerosDesordenados));
        
        // Ordenamiento ascendente con el método de la burbuja
        for (int i = 0; i < numerosDesordenados.length - 1; i++) {
            for (int j = 0; j < numerosDesordenados.length - i - 1; j++) {
                if (numerosDesordenados[j] > numerosDesordenados[j + 1]) {
                    int temp = numerosDesordenados[j];
                    numerosDesordenados[j] = numerosDesordenados[j + 1];
                    numerosDesordenados[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Arreglo ordenado ascendente: " + Arrays.toString(numerosDesordenados));
        
        // Ordenamiento descendente con el método de selección
        for (int i = 0; i < numerosDesordenados.length - 1; i++) {
            int indiceMaximo = i;
            for (int j = i + 1; j < numerosDesordenados.length; j++) {
                if (numerosDesordenados[j] > numerosDesordenados[indiceMaximo]) {
                    indiceMaximo = j;
                }
            }
            int temp = numerosDesordenados[indiceMaximo];
            numerosDesordenados[indiceMaximo] = numerosDesordenados[i];
            numerosDesordenados[i] = temp;
        }
        
        System.out.println("Arreglo ordenado descendente: " + Arrays.toString(numerosDesordenados));
    }
}