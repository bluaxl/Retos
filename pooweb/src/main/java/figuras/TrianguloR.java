package figuras;
import java.util.Scanner;

public class TrianguloR extends Figura{
    private float b;
    private float h;

    public TrianguloR() {
    }

    public TrianguloR(float b, float h) {
        this.b = b;
        this.h = h;
    }

    Scanner leer = new Scanner(System.in);

    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public float getH() {
        return h;
    }
    public void setH(float h) {
        this.h = h;
    }
    
    public void registrardatos(){
        System.out.println("digite la altura del triangulo rectangulo: ");
        h = leer.nextFloat();
        System.out.println("digite la base del triangulo rectangulo: ");
        b = leer.nextFloat();
    }
   
    @Override
    public double calcularArea() {
        double area = (b*h)/2;
        return area;
    }

    public void mostrarArea(float area){
        System.out.println("el area de su triangulo rectangulo es de: "+area);
    }
}
