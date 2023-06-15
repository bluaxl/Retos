package Reto4;

import java.util.Scanner;

public class TrianguloR extends Figura{
    private float b;
    private float h;
    Scanner leer = new Scanner(System.in);
    public void registrardatos(){
        System.out.println("digite la altura del triangulo rectangulo: ");
        h = leer.nextFloat();
        System.out.println("digite la base del triangulo rectangulo: ");
        b = leer.nextFloat();
    }

    public float calcularArea() {
        float area = (b*h)/2;
        return area;
    }

    public void mostrarArea(float area){
        System.out.println("el area de su triangulo rectangulo es de: "+area);
    }
}
