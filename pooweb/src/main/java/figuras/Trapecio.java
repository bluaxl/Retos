package figuras;

public class Trapecio extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    private double baseMenor;
    private double baseMayor;
    private double h;
    
    public Trapecio() {
    }

    public Trapecio(double lado1, double lado2, double lado3, double lado4, double baseMenor, double baseMayor,
            double h) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
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



    public double getLado4() {
        return lado4;
    }



    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }



    public double getBaseMenor() {
        return baseMenor;
    }



    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }



    public double getBaseMayor() {
        return baseMayor;
    }



    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }



    public double getH() {
        return h;
    }



    public void setH(double h) {
        this.h = h;
    }



    @Override
    public double calcularArea() {
        double area = ((baseMayor+baseMenor)/2)*h;
        return area;
    }
    @Override
    public double calcularPerimetro(){
        double perimetro = lado1+lado2+lado3+lado4;
        return perimetro;
    }

}
