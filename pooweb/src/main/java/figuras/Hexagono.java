package figuras;

public class Hexagono extends Figura{
    private double lado;
    private double perimetro;
    private double apotema;

    public Hexagono() {
    }

    public Hexagono(double perimetro, double apotema, double lado) {
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void mostrarArea(Double area){
        System.out.println(area);
    }
    @Override
        public double calcularArea(){
        double area = (perimetro*apotema)/2;
        return area;
    }

    @Override
        public double calcularPerimetro(){
            double perimetro = lado*6;
            return perimetro;
        }
}