package figuras;

public class Rombo extends Figura{
    private double lado;
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo() {
    }

    public Rombo(Double lado, Double diagonalMayor, Double diagonalMenor) {
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(Double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public Double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(Double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        double area = (diagonalMayor*diagonalMenor)/2;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = lado*4;
        return perimetro;
    }
    
}
