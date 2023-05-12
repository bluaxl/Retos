package Retos;

import java.util.Scanner;

public class RetoVIII {
    public static void main(String[] args) {
        int NProductos;
        int producto;
        int sum=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("digite la cantidad de productos que desea comprar");
        NProductos = leer.nextInt();
        for (int i=1;i<NProductos+1;i++ ) {
            System.out.println("ingrese al valor a pagar por el producto #"+i);
            producto = leer.nextInt();
            sum = sum + producto;
        }
        System.out.println("el valor total a pagar es de "+sum);
        leer.close();
    }
}
