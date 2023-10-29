
package ejercicio28;

import java.util.Scanner;
public class Ejercicio28 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ingreso de Datos Inicial
        int cantidadEstudiantes = ingresarEntero(scanner, "Ingrese la cantidad de estudiantes (entre 1 y 10): ", 1, 10);
        int cantidadPeriodos = ingresarEntero(scanner, "Ingrese la cantidad de períodos académicos (entre 3 y 5): ", 3, 5);
        
        // Almacenamiento de Calificaciones
        double[][] calificaciones = new double[cantidadEstudiantes][cantidadPeriodos];
        
        // Menú de Opciones
        int opcion;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Ingresar calificaciones por período");
            System.out.println("2. Ingresar calificaciones por estudiante");
            System.out.println("3. Ver calificaciones");
            System.out.println("4. Salir");
            opcion = ingresarEntero(scanner, "Ingrese una opción: ", 1, 4);
            
            switch (opcion) {
                case 1:
                    // Ingreso de Calificaciones por Período
                    int numeroPeriodo = ingresarEntero(scanner, "Ingrese el número de período (entre 1 y " + cantidadPeriodos + "): ", 1, cantidadPeriodos);
                    ingresarCalificacionesPorPeriodo(scanner, calificaciones, numeroPeriodo);
                    break;
                case 2:
                    // Ingreso de Calificaciones por Estudiante
                    int numeroEstudiante = ingresarEntero(scanner, "Ingrese el número de estudiante (entre 1 y " + cantidadEstudiantes + "): ", 1, cantidadEstudiantes);
                    numeroPeriodo = ingresarEntero(scanner, "Ingrese el número de período (entre 1 y " + cantidadPeriodos + "): ", 1, cantidadPeriodos);
                    ingresarCalificacionesPorEstudiante(scanner, calificaciones, numeroEstudiante, numeroPeriodo);
                    break;
                case 3:
                    // Ver Calificaciones
                    verCalificaciones(calificaciones);
                    break;
            }
        } while (opcion != 4);
        
        // Salida del Programa
        System.out.println("¡Hasta luego!");
    }
    
    public static int ingresarEntero(Scanner scanner, String mensaje, int min, int max) {
        int numero;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("¡Error! Ingrese un número entero válido.");
                System.out.print(mensaje);
                scanner.next();
            }
            numero = scanner.nextInt();
            if (numero < min || numero > max) {
                System.out.println("¡Error! Ingrese un número entre " + min + " y " + max + ".");
            }
        } while (numero < min || numero > max);
        return numero;
    }
    
    public static void ingresarCalificacionesPorPeriodo(Scanner scanner, double[][] calificaciones, int numeroPeriodo) {
        System.out.println("Ingresar calificaciones por período " + numeroPeriodo + ":");
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i][numeroPeriodo - 1] = ingresarDouble(scanner, "Ingrese la calificación del estudiante " + (i + 1) + ": ", 0, 10);
        }
        System.out.println("¡Calificaciones ingresadas exitosamente!");
    }
    
    public static void ingresarCalificacionesPorEstudiante(Scanner scanner, double[][] calificaciones, int numeroEstudiante, int numeroPeriodo) {
        System.out.println("Ingresar calificaciones para el estudiante " + numeroEstudiante + " en el período " + numeroPeriodo + ":");
        calificaciones[numeroEstudiante - 1][numeroPeriodo - 1] = ingresarDouble(scanner, "Ingrese la calificación: ", 0, 10);
        System.out.println("¡Calificación ingresada exitosamente!");
    }
    
    public static double ingresarDouble(Scanner scanner, String mensaje, double min, double max) {
        double numero;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextDouble()) {
                System.out.println("¡Error! Ingrese un número válido.");
                System.out.print(mensaje);
                scanner.next();
            }
            numero = scanner.nextDouble();
            if (numero < min || numero > max) {
                System.out.println("¡Error! Ingrese un número entre " + min + " y " + max + ".");
            }
        } while (numero < min || numero > max);
        return numero;
    }
    
    public static void verCalificaciones(double[][] calificaciones) {
        System.out.println("Calificaciones:");
        System.out.print("Estudiante/Período\t");
        for (int i = 0; i < calificaciones[0].length; i++) {
            System.out.print("P" + (i + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ":\t\t");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + "\t");
            }
            System.out.println();
        }
    }
}