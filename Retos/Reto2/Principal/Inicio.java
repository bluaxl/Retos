package Reto2.Principal;

import Reto2.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona name = new Persona();
        double pesoActual = name.calcularmc(name.pedirDatos());
        if(pesoActual<20){
            System.out.println("el peso esta por debajo de lo ideal");
        }
        else if(pesoActual>=20 && pesoActual <= 25){
            System.out.println("el peso es ideal");
        }
        else if (pesoActual>25){
            System.out.println("esta en sobrepeso");
        }
    }
}
