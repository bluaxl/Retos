package Retos2;

import java.util.Scanner;

public class RetoI {
    public static void main(String[] args) {
        int c_notas;
        double res=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("¿digite la cantidad de notas a evaluar?");
        c_notas=leer.nextInt();
        double[] notas = new double[c_notas];
        for (double num:notas) {
            System.out.println("ingrese la primera nota");
            num = leer.nextInt();
            res=res+num;
        }
        res=res/c_notas;
        System.out.println("el promedio de las notas es: "+res);
        if (res<3){
            System.out.println("Reprobaste");
        }
        else if (res>=3 && res < 4){
            System.out.println("pasaste rasapando");
        }
        else if(res>4){
            System.out.println("aprobaste con buenos resultados");
        }
        else{
            System.out.println("Error de digitación");
        }
        leer.close();
    }
}
