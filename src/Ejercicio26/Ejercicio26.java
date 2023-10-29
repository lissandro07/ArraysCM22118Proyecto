
package ejercicio26;
import java.util.Scanner;
public class Ejercicio26 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la cantidad de filas para el microbús
        System.out.print("Ingrese la cantidad de filas para el microbús (entre 6 y 10): ");
        int filas = scanner.nextInt();
        
        // Validar la cantidad de filas
        if (filas < 6 || filas > 10) {
            System.out.println("La cantidad de filas debe estar entre 6 y 10. El programa ha finalizado.");
            return;
        }
        
        // Crear los arrays para los asientos del lado izquierdo y derecho
        int[] asientosIzquierdo = new int[filas];
        int[] asientosDerecho = new int[filas];
        
        // Inicializar los arrays con el valor por defecto (-1)
        for (int i = 0; i < filas; i++) {
            asientosIzquierdo[i] = -1;
            asientosDerecho[i] = -1;
        }
        
        // Variable para almacenar el total de ventas
        int totalVentas = 0;
        
        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Ver Distribución");
            System.out.println("2. Vender Asientos");
            System.out.println("3. Devolver Asientos");
            System.out.println("4. Mostrar la Caja");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Ver Distribución
                    System.out.println("\nDistribución actual de asientos:");
                    System.out.println("Lado Izquierdo: " + java.util.Arrays.toString(asientosIzquierdo));
                    System.out.println("Lado Derecho: " + java.util.Arrays.toString(asientosDerecho));
                    break;
                case 2:
                    // Vender Asientos
                    System.out.print("\nSeleccione el lado (1 - Izquierdo, 2 - Derecho): ");
                    int lado = scanner.nextInt();
                    
                    // Validar el lado seleccionado
                    if (lado != 1 && lado != 2) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                    }
                    
                    System.out.print("Ingrese la cantidad de asientos a vender (1 o 2): ");
                    int cantidad = scanner.nextInt();
                    
                    // Validar la cantidad de asientos
                    if (cantidad != 1 && cantidad != 2) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                    }
                    
                    // Verificar disponibilidad de asientos
                    if (lado == 1) {
                        if (!verificarDisponibilidad(asientosIzquierdo, cantidad)) {
                            System.out.println("Los asientos seleccionados ya están ocupados. Intente nuevamente.");
                            break;
                        }
                    } else {
                        if (!verificarDisponibilidad(asientosDerecho, cantidad)) {
                            System.out.println("Los asientos seleccionados ya están ocupados. Intente nuevamente.");
                            break;
                        }
                    }
                    
                    // Mostrar la distribución de asientos del lado seleccionado
                    if (lado == 1) {
                        System.out.println("\nDistribución de asientos (Lado Izquierdo):");
                        System.out.println(java.util.Arrays.toString(asientosIzquierdo));
                    } else {
                        System.out.println("\nDistribución de asientos (Lado Derecho):");
                        System.out.println(java.util.Arrays.toString(asientosDerecho));
                    }
                    
                    // Marcar los asientos seleccionados como vendidos
                    if (lado == 1) {
                        marcarAsientos(asientosIzquierdo, cantidad);
                    } else {
                        marcarAsientos(asientosDerecho, cantidad);
                    }
                    
                    // Actualizar el total de ventas
                    totalVentas += cantidad;
                    System.out.println("Se han vendido " + cantidad + " asientos. Total de ventas: " + totalVentas);
                    break;
                case 3:
                    // Devolver Asientos
                    System.out.print("\nIngrese el lado del asiento a devolver (1 - Izquierdo, 2 - Derecho): ");
                    int ladoDevolver = scanner.nextInt();
                    
                    // Validar el lado seleccionado
                    if (ladoDevolver != 1 && ladoDevolver != 2) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                    }
                    
                    System.out.print("Ingrese el número de asiento a devolver: ");
                    int numeroAsiento = scanner.nextInt();
                    
                    // Validar el número de asiento
                    if (numeroAsiento < 1 || numeroAsiento > filas) {
                        System.out.println("Número de asiento inválido. Intente nuevamente.");
                        break;
                    }
                    
                    // Devolver el asiento si está ocupado
                    if (ladoDevolver == 1) {
                        if (asientosIzquierdo[numeroAsiento - 1] == 1) {
                            asientosIzquierdo[numeroAsiento - 1] = -1;
                            totalVentas--;
                            System.out.println("El asiento " + numeroAsiento + " del lado izquierdo ha sido devuelto.");
                        } else {
                            System.out.println("El asiento " + numeroAsiento + " del lado izquierdo no está ocupado.");
                        }
                    } else {
                        if (asientosDerecho[numeroAsiento - 1] == 1) {
                            asientosDerecho[numeroAsiento - 1] = -1;
                            totalVentas--;
                            System.out.println("El asiento " + numeroAsiento + " del lado derecho ha sido devuelto.");
                        } else {
                            System.out.println("El asiento " + numeroAsiento + " del lado derecho no está ocupado.");
                        }
                    }
                    break;
                case 4:
                    // Mostrar la Caja
                    System.out.println("\nTotal de ventas acumulado hasta el momento: " + totalVentas);
                    break;
                case 5:
                    // Salir
                    System.out.println("\n¡Gracias por utilizar el programa!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
        
        scanner.close();
    }
    
    // Método para verificar la disponibilidad de asientos
    public static boolean verificarDisponibilidad(int[] asientos, int cantidad) {
        int contador = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == -1) {
                contador++;
                if (contador == cantidad) {
                    return true;
                }
            } else {
                contador = 0;
            }
        }
        return false;
    }
    
    // Método para marcar los asientos como vendidos
    public static void marcarAsientos(int[] asientos, int cantidad) {
        int contador = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == -1) {
                asientos[i] = 1;
                contador++;
                if (contador == cantidad) {
                    break;
                }
            }
        }
    }
}