package figuras;

public class TrianguloR extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;
    private double b;
    private double h;

    public TrianguloR() {
    }

    public TrianguloR(double lado1, double lado2, double lado3, double b, double h) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.b = b;
        this.h = h;
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        double area = (b*h)/2;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro =  lado1+lado2+lado3;
        return perimetro;
    }
}
