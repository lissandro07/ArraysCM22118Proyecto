package Ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {
    private char[][] tablero;
    private char jugadorActual;

    public Ejercicio27() {
        tablero = new char[3][3];
        jugadorActual = 'X';
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    private void cambiarJugador() {
        if (jugadorActual == 'X') {
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }
    }

    private boolean movimientoValido(int fila, int columna) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
            return false;
        }
        return tablero[fila][columna] == '-';
    }

    private void realizarMovimiento(int fila, int columna) {
        tablero[fila][columna] = jugadorActual;
    }

    private boolean hayGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
                return true;
            }
        }

        // Verificar diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }

        return false;
    }

    private boolean hayEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private void mostrarTablero() {
        System.out.println("Tablero actual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarTablero();
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Ingrese la fila: ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna: ");
            int columna = scanner.nextInt();

            if (movimientoValido(fila, columna)) {
                realizarMovimiento(fila, columna);
                if (hayGanador()) {
                    mostrarTablero();
                    System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                    break;
                } else if (hayEmpate()) {
                    mostrarTablero();
                    System.out.println("El juego ha terminado en empate.");
                    break;
                } else {
                    cambiarJugador();
                }
            } else {
                System.out.println("Movimiento inválido. Inténtelo nuevamente.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio27 juego = new Ejercicio27();
        juego.jugar();
    }
}