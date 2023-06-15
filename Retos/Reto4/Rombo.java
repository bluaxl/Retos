package Reto4;

import java.util.Scanner;

public class Rombo extends Figura{
    private float diagonalMayor;
    private float diagonalMenor;

    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(float diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public float getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(float diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    Scanner leer = new Scanner(System.in);
    public void registrardatos(){
        System.out.println("digite el diagonal mayor del rombo");
        diagonalMayor = leer.nextFloat();
        System.out.println("digite el diagonal menor del rombo");
        diagonalMenor = leer.nextFloat();
    }

    public float calcularArea() {
        float area = (diagonalMayor*diagonalMenor)/2;
        return area;
    }
    
    public void mostrarArea(float area){
        System.out.println("el area de su rombo es: "+area);
    }
}
