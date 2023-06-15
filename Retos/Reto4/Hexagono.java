package Reto4;
import java.util.Scanner;
public class Hexagono extends Figura{
    private float perimetro;
    private float apotema;
    public float getPerimetro() {
        return perimetro;
    }
    public float getApotema() {
        return apotema;
    }
    Scanner leer = new Scanner(System.in);
    public void registrarDa(){
        System.out.println("digite el perimetro: ");
        perimetro = leer.nextFloat();
        System.out.println("digite el apotema: ");
        apotema = leer.nextFloat();
    }
    public float calcularArea(){
        float area = (perimetro*apotema)/2;
        return area;
    }
    public void mostrarArea(float area){
        System.out.println(area);
    }
}