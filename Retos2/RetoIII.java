package Retos2;
import java.util.*;
public class RetoIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] productos = new String[16][2]; // [filas][columanas]
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el nombre del " + (i+1)+ " producto: ");
            productos[i][0] = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            productos[i][1] = scanner.nextLine();
        }
 
        System.out.println("\n\tCatálogo de productos:");

        for (int i = 0; i < 2; i++) {
            System.out.println("Codigo: ("+i + ",0)\t Nombre: " + productos[i][0]+ "\tPrecio: " + productos[i][1]);
        }
        scanner.close();
    }
}

