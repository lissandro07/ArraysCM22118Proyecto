package ejercicio21;

public class Ejercicio21 {

    public static void main(String[] args) {
       // Declarar e inicializar el array original
int[] arrayOriginal = {1, 2, 3, 4, 5};


int[] arrayInvertido = new int[arrayOriginal.length];


for (int i = arrayOriginal.length - 1; i >= 0; i--) {
    
    arrayInvertido[arrayOriginal.length - 1 - i] = arrayOriginal[i];
}

// Imprimir el nuevo array invertido

System.out.print("Array invertido: ");
for (int i = 0; i < arrayInvertido.length; i++) {
    System.out.print(arrayInvertido[i] + " ");
}
    }
    
}
