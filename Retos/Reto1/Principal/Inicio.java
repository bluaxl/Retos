package Reto1.Principal;

import Reto1.Salud.Persona;

public class Inicio{
    public static void main(String[] args) {
       Persona name = new Persona();

        name.pedirDatos();
        name.mostrarPersona();
        name.calcularmc();
        name.mayorEdad();
    }
}
