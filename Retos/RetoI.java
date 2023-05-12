package Retos;

public class RetoI {
    public static void main(String[] arg) throws Exception {
        //declaración de variables
        double temp = 350, centi = 0;
        //Calcular la temperatura en centigrados
        centi = (temp - 32)/1.8;
        //mostrar resultados
        System.out.println("la temperatura para precalentar el horno es: " + centi);
    }
}
