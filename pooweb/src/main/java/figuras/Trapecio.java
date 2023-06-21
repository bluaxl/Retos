package figuras;

import java.util.Scanner;

public class Trapecio extends Figura{
    private float baseMenor;
    private float baseMayor;
    private float h;

    public Trapecio() {
    }
    
    public Trapecio(float baseMenor, float baseMayor, float h) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.h = h;
    }

    public float getBaseMayor() {
        return baseMayor;
    }
    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
    }
    public float getH() {
        return h;
    }
    public void setH(float h) {
        this.h = h;
    }
    Scanner leer = new Scanner(System.in);
    public void registrardatos(){ 
        System.out.println("digite la base menor del trapecio: ");
        baseMenor = leer.nextFloat();
        System.out.println("digite la base mayor del trapecio: ");
        baseMayor = leer.nextFloat();
        System.out.println("digite la altura del trapecio: ");
        h = leer.nextFloat();
    }
    @Override
    public double calcularArea() {
        double area = ((baseMayor+baseMenor)/2)*h;
        return area;
    }
    public void mostrarArea(float area){
        System.out.println("el area de su trapecio es de: "+ area);
    }
}
