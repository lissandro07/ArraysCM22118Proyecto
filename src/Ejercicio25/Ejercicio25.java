
package ejercicio25;


public class Ejercicio25 {

    public static void main(String[] args) {
        String contrasena = "Ax5@abcdefg";

        boolean cumpleRequisitos = verificarContrasena(contrasena);

        if (cumpleRequisitos) {
            System.out.println("La contraseña cumple con los requisitos.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }

    public static boolean verificarContrasena(String contrasena) {
        // Verificar longitud
        if (contrasena.length() < 8) {
            return false;
        }

        // Verificar letra mayúscula
        boolean tieneMayuscula = false;
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
                break;
            }
        }
        if (!tieneMayuscula) {
            return false;
        }

        // Verificar letra minúscula
        boolean tieneMinuscula = false;
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
                break;
            }
        }
        if (!tieneMinuscula) {
            return false;
        }

        // Verificar dígito
        boolean tieneDigito = false;
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneDigito = true;
                break;
            }
        }
        if (!tieneDigito) {
            return false;
        }

        // Verificar símbolo
        boolean tieneSimbolo = false;
        for (char c : contrasena.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                tieneSimbolo = true;
                break;
            }
        }
        if (!tieneSimbolo) {
            return false;
        }

        return true;
    }
}