package Reto5;

import java.util.Scanner;

public class Ppt implements Juego{
    private int eleccion = 0; 
    private int maquina = 0;
    private String jugador;
    Scanner leer = new Scanner(System.in);
    public void iniciar(){
        System.out.println("ingrese el nombre del jugador");
        jugador = leer.next();
    }
    
    public void jugar(){
        System.out.println("escoja \n 1. piedra \n 2. papel \n 3. tijera");
        eleccion = leer.nextInt();
        maquina = (int)(Math.random()*3+1);
    }
    public void finalizar(){
        if (maquina==1 && eleccion == 1) {
            System.out.println("empate la maquina saco piedra "+jugador);            
        }
        else if (maquina==1 && eleccion == 2){
            System.out.println("Ganaste la maquina saco piedra "+jugador);
        }
        else if (maquina==1 && eleccion == 3){
            System.out.println("perdiste la maquina saco piedra "+jugador);
        }
        else if (maquina==2 && eleccion == 1){
            System.out.println("perdiste la maquina saco papel "+jugador);
        }
        else if (maquina==2 && eleccion == 2){
            System.out.println("empate la maquina saco papel "+jugador);
        }
        else if (maquina==2 && eleccion == 3){
            System.out.println("Ganaste la maquina saco papel "+jugador);
        }
        else if (maquina==3 && eleccion == 1){
            System.out.println("ganaste la maquina saco tijera "+jugador);
        }
        else if (maquina==3 && eleccion == 2){
            System.out.println("perdiste la maquina saco tijera "+jugador);
        }
        else if (maquina==3 && eleccion == 3){
            System.out.println("empate la maquina saco tijera "+jugador);
        }
        leer.close();
    }
}
