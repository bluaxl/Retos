package Retos;

import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        //instanciar (crear un nuevo objeto) el scanner
        Scanner lectura = new Scanner(System.in);
        System.out.println("escoja 1.cara o 2.sello");
        int seleccion = lectura.nextInt();
        int numero = (int)(Math.random()*2+1);
        if(seleccion == numero){
            System.out.println("su eleccion es correcta");
        }
        else if (seleccion != numero){
            System.out.println("su eleccion fue incorrecta");
        }
        else{
            System.out.println("Error");
        }
        lectura.close();
    }
}
