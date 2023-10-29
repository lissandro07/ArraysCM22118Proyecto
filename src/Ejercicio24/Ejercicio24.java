
package ejercicio24;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio24 {

  
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        
        Set<Integer> set = new HashSet<>();
        for (int i : arrayOriginal) {
            set.add(i);
        }
        
        int[] arraySinDuplicados = new int[set.size()];
        int index = 0;
        for (int i : set) {
            arraySinDuplicados[index++] = i;
        }
        
        // Imprimir el nuevo array sin duplicados
        for (int i : arraySinDuplicados) {
            System.out.print(i + " ");
        }
    }
}