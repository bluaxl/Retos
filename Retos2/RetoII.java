package Retos2;

import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {
        int winner = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("digite la cantidad de competidores");
        int n = leer.nextInt();
        String[] name = new String[n];
        int[] time = new int[n];
        for (int i = 0; i < name.length; i++) {
            System.out.println("digite el nombre del "+(i+1)+" competidor");
            name[i]=leer.next();
            System.out.println(" ");
            System.out.println("digite el tiempo del "+(i+1)+" competidor");
            time[i]=leer.nextInt();
        }

        double min = time[0];
        for (int i = 0; i < n; i++) {
            if (time[i] < min) {
                min = time[i];
                winner = i;
            }
            System.out.println("El competidor: " + name[i] + " obtuvo un tiempo de: " + time[i]);
        }
        System.out.println("El ganador es "+ name[winner] + " con un tiempo de " + min);
        leer.close();
    }
}
