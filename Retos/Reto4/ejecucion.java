package Reto4;
public class ejecucion {
        public static void main(String[] args) {
        Hexagono hexagono = new Hexagono();
        hexagono.registrarDa();
        float areaC = hexagono.calcularArea();
        hexagono.mostrarArea(areaC);

        Trapecio trapecio = new Trapecio();
        trapecio.registrardatos();
        float areaT = trapecio.calcularArea();
        trapecio.mostrarArea(areaT);

        Rombo rombo = new Rombo();
        rombo.registrardatos();
        float areaR = rombo.calcularArea();
        rombo.mostrarArea(areaR);

        TrianguloR trianguloR = new TrianguloR();
        trianguloR.registrardatos();
        float areaTR = trianguloR.calcularArea();
        trianguloR.mostrarArea(areaTR);   
        }
}
