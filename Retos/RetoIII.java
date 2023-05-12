package Retos;
import java.util.Scanner;
public class RetoIII {
    public static void main(String[] args) {
        int eleccion = 0; 
        int maquina = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("escoja \n 1. piedra \n 2. papel \n 3. tijera");
        eleccion = leer.nextInt();
        maquina = (int)(Math.random()*3+1);
        if (maquina==1 && eleccion == 1) {
            System.out.println("empate la maquina saco piedra");            
        }
        else if (maquina==1 && eleccion == 2){
            System.out.println("Ganaste la maquina saco piedra");
        }
        else if (maquina==1 && eleccion == 3){
            System.out.println("perdiste la maquina saco piedra");
        }
        else if (maquina==2 && eleccion == 1){
            System.out.println("perdiste la maquina saco papel");
        }
        else if (maquina==2 && eleccion == 2){
            System.out.println("empate la maquina saco papel");
        }
        else if (maquina==2 && eleccion == 3){
            System.out.println("Ganaste la maquina saco papel");
        }
        else if (maquina==3 && eleccion == 1){
            System.out.println("ganaste la maquina saco tijera");
        }
        else if (maquina==3 && eleccion == 2){
            System.out.println("perdiste la maquina saco tijera");
        }
        else if (maquina==3 && eleccion == 3){
            System.out.println("empate la maquina saco tijera");
        }
        leer.close();
    }
}