
package ejercicio19;
import java.util.Scanner;
public class Ejercicio19 {


    public static void main(String[] args) {
        int[][] tabla = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los valores de la tabla
        System.out.println("Ingrese los valores de la tabla:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                tabla[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la tabla es simétrica
        boolean simetrica = true;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (tabla[i][j] != tabla[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        // Mostrar el resultado
        if (simetrica) {
            System.out.println("La tabla es simétrica.");
        } else {
            System.out.println("La tabla no es simétrica.");
        }
    }
}