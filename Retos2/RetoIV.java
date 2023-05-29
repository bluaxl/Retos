package Retos2;

import java.util.Scanner;

public class RetoIV {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingresa la palabra a adivinar: ");
    String palabra = scanner.nextLine().toLowerCase();
    
    char[] letrasAdivinadas = new char[palabra.length()];
    for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = '_';
    }
    
    int intentos = 7;
    boolean juego = false;
    
    while (!juego) {
        System.out.println(" ");
        System.out.println(letrasAdivinadas);
        System.out.println("Intentos restantes: " + intentos);
        System.out.print("Ingresa una letra: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);
        
        boolean letraAdivinada = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                letrasAdivinadas[i] = letra;
                letraAdivinada = true;
            }
        }
        
        if (!letraAdivinada) {
            intentos--;
            System.out.println("¡Letra incorrecta!");
        }
        
        if (intentos == 0) {
            juego = true;
            System.out.println("¡Perdiste! La palabra era: " + palabra);
        }
        
        if (String.valueOf(letrasAdivinadas).equals(palabra)) {
            juego = true;
            System.out.println("felicidades adivinaste la palabra "+palabra);
        }
    }
    scanner.close();
}
}
