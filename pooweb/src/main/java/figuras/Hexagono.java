package figuras;
import java.util.Scanner;
public class Hexagono extends Figura{
    private double perimetro;
    private double apotema;

    public Hexagono() {
    }
    
    public Hexagono(double perimetro, double apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }
    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    Scanner leer = new Scanner(System.in);
    public void registrarDa(){
        System.out.println("digite el perimetro: ");
        perimetro = leer.nextFloat();
        System.out.println("digite el apotema: ");
        apotema = leer.nextFloat();
    }

    public void mostrarArea(Double area){
        System.out.println(area);
    }
    @Override
        public double calcularArea(){
        double area = (perimetro*apotema)/2;
        return area;
    }
}