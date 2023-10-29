package ejercicio17;

public class Ejercicio17 {


    public static void main(String[] args) {
      // Crear la matriz de tamaño 3x3
      int[][] matriz = new int[3][3];

      // Cargar la matriz con valores
      matriz[0][0] = 1;
      matriz[0][1] = 2;
      matriz[0][2] = 3;
      matriz[1][0] = 4;
      matriz[1][1] = 5;
      matriz[1][2] = 6;
      matriz[2][0] = 7;
      matriz[2][1] = 8;
      matriz[2][2] = 9;

      // Mostrar la matriz original
      System.out.println("Matriz original:");
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
         }
         System.out.println();
      }

      // Transponer la matriz
      int[][] matrizTranspuesta = new int[3][3];
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
            matrizTranspuesta[j][i] = matriz[i][j];
         }
      }

      // Mostrar la matriz transpuesta
      System.out.println("Matriz transpuesta:");
      for (int i = 0; i < matrizTranspuesta.length; i++) {
         for (int j = 0; j < matrizTranspuesta[i].length; j++) {
            System.out.print(matrizTranspuesta[i][j] + " ");
         }
         System.out.println();
      }
   }
}