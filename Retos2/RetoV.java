package Retos2;

import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {
        int atino = 0;
        Scanner leer = new Scanner(System.in);
        String [][] concentrese = {{"0","1"},{"1","0"}};
        String [][] mostrar = {{"*","*"},{"*","*"}}; 
        System.out.println("tienes 3 intentos para adivinar");
        for(int a=1; a<5 && atino !=2;a++){
            System.out.println("intento: "+a);
            System.out.println(" ");
            System.out.println("  0 1");
            for(int filas = 0; filas < 2; filas ++){   
                System.out.print(filas+" ");
                for(int col = 0; col<2;col++){
                    System.out.print(mostrar[filas][col]+" ");
                }
                System.out.println(" ");
            }

                System.out.println(" ");
                System.out.println("escoja el numero de la fila");
                int f = leer.nextInt();
                System.out.println("escoja el numero de la columna");
                int c = leer.nextInt();
                System.out.println("en su seleccion se encuentra el numero "+concentrese[f][c]);
                System.out.println("\nescoja la fila donde cree que este el par");
                int f1 = leer.nextInt();
                System.out.println("\nescoja la columna donde cree que este el par");
                int c1 = leer.nextInt();

            while(f == f1 && c == c1){
                System.out.println("escogio la misma fila y el mismo numero intente ingresar otro valor");
                System.out.println("escoja la fila donde cree que este el par");
                f1 = leer.nextInt();
                System.out.println("escoja la columna donde cree que este el par");
                c1 = leer.nextInt();
            }
            if(mostrar[f][c].equals("*") && mostrar[f1][c1].equals("*")){
                if(concentrese[f][c].equals(concentrese[f1][c1])){
                    System.out.println("le atinaste");
                    mostrar[f][c]=concentrese[f][c];
                    mostrar[f1][c1]=concentrese[f1][c1];
                    atino ++;
                }
                else{
                    System.out.println("fallaste");
                }
            }
            else{
                System.out.println("\n ya adiviniaste el numero en alguno de esas posiciones");
            }
    }
        System.out.println("\nFIN DEL JUEGO");
        leer.close();
    }
}
