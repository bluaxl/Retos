package Retos;
import java.util.Scanner;
public class RetoII {
    public static void main(String[] arg) {
        //declaracion de variables}
        String N_enfermera;
        String N_bebe;
        String N_padre;
        int peso;
        int meses;
        double DosisVacuna;
        //solicitud de variables
        Scanner  lectura = new Scanner(System.in);
        System.out.println("Nombre de la enfermera");
        N_enfermera = lectura.next();
        System.out.println("Nombre del bebe");
        N_bebe = lectura.next();
        System.out.println("Nombre del acudiente");
        N_padre = lectura.next();
        System.out.println("peso del bebe");
        peso = lectura.nextInt();
        System.out.println("meses del bebe");
        meses = lectura.nextInt();
        //porcesos

        DosisVacuna = (peso + 10 / meses * 10) * 8;

        //salida de datos

        System.out.println("la dosis de la vacuna para el bebe " + N_bebe + " con acudiente de nombre " + N_padre + " es de " + DosisVacuna + " segun la enfermera " + N_enfermera);

        lectura.close();
    }
}
