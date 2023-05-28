package Retos2;

import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        int intentos = 7;
        StringBuilder palabraAdivinada = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivinada.append("_");
        }

        while (intentos > 0) {
            System.out.println("Palabra adivinada: " + palabraAdivinada);
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);

            boolean letraAdivinada = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraAdivinada.setCharAt(i, letra);
                    letraAdivinada = true;
                }
            }

            if (!letraAdivinada) {
                intentos--;
                System.out.println("La letra no está en la palabra. Intenta de nuevo.");
            }

            if (palabraAdivinada.toString().equals(palabra)) {
                System.out.println("¡Felicidades! Has adivinado la palabra correctamente.");
                break;
            }
        }

        if (intentos == 0) {
            System.out.println("Has perdido. La palabra correcta era: " + palabra);
        }

        scanner.close();
    }
}
