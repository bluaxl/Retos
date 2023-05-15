package Retos;
import java.util.Scanner;
public class RetoVII {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);

        int C_Juegos = 0;
        int desicion = 1;
        int global;
        int bet;
       
        System.out.println("digite la cantidad global para apostar");
        global = Lectura.nextInt();
        while (desicion==1) {
            
            while(global==0 && desicion ==1){
                System.out.println("No cuentas con dinero suficiente para apostar");
                System.out.println("digite la cantidad global para apostar");
                global = Lectura.nextInt();
            }

            System.out.println("cuanto desea apostar");
            bet = Lectura.nextInt();

            while (bet > global) {
                System.out.println("Como maximo puede apostar " + global);
                System.out.println("ingrese su apuesta");
                bet = Lectura.nextInt();
            }
           
            System.out.println("Jugador, escoja");
            System.out.println("1 -  Cara");
            System.out.println("2 -  Sello");
            int option = Lectura.nextInt();  
       
            if(option !=1 && option != 2){
                System.out.println("El opcion seleccionada es erronea");
                System.exit(0);
            }
           
            int RandomNumber = (int)(Math.random()*2+1);
            if(RandomNumber == 2){
                System.out.println("Gano sello");
                if(option == 2){
                    System.out.println("Usted gano");
                    global = global+bet;
                    bet = bet*2;
                    System.out.println("Global "+ global);
                    System.out.println("Su apuesta se duplico "+ bet);

                }else{
                    System.out.println("Usted Perdio");
                    global=global-bet;
                    System.out.println("Global "+ global);
                }
            }
            else{
                System.out.println("Gano cara");
                if(option == 1){
                    System.out.println("Usted gano");
                    global = global+bet;
                    bet = bet*2;
                    System.out.println("Global "+ global);
                    System.out.println("Su apuesta se duplico "+ bet);
                }else{
   
                    System.out.println("Usted Perdio");
                    global=global-bet;
                    System.out.println("Global "+ global);
                }

            }

            System.out.println("Quiere seguir jugando?");
            System.out.println("1 Si");
            System.out.println("2 No");
            desicion = Lectura.nextInt();
            C_Juegos++;
        }
        System.out.println("Jugaste "+C_Juegos+" veces");
        System.out.println("Tu dinero acumulado es "+ global);

        Lectura.close();
    }
}