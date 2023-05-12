package Retos;
import java.util.Scanner;
public class RetoVI {
    public static void main(String[] args) {
        int Option=0;
        int maquina=0;
        String resp;
        Scanner Lectura = new Scanner(System.in);
        do{
        System.out.println("La computadora ya escojio...");
        System.out.println("Seleccione una opcion \n 1. piedra \n 2. papel \n 3. tijera");
        Option = Lectura.nextInt();
        maquina = (int)(Math.random()*3+1);
        switch (maquina) {
            case 1:
                System.out.println("Piedra");
                    switch (Option) {
                        case 1:
                            System.out.println("Empate");
                            System.out.println("Nadie gana");
                            break;
                        case 2:
                            System.out.println("Ganaste");
                            System.out.println("la maquina saco piedra");
                            break;
                    
                        case 3:
                            System.out.println("perdiste, la maquina gana");
                            System.out.println("la maquina saco piedra");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;

            case 2:
                System.out.println("Papel");
                    switch (Option) {
                        case 1:
                            System.out.println("Perdiste, la maquina gana");
                            System.out.println("la maquina saco papel");
                            break;
                        case 2:
                            System.out.println("Empate");
                            System.out.println("Nadie Gana");
                            break;
                    
                        case 3:
                            System.out.println("Ganaste");
                            System.out.println("la maquina saco papel");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;

            case 3:
                System.out.println("Tijera");
                    switch (Option) {
                        case 1:
                            System.out.println("Ganaste");
                            System.out.println("la maquina saco tijera");
                            break;
                        case 2:
                            System.out.println("Gana la maquina");
                            System.out.println("la maquina saco tijera");
                            break;
                    
                        case 3:
                            System.out.println("Empate");
                            System.out.println("Nadie Gana");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;
        
            default:
            System.out.println("Error");
            System.exit(0);
            break;
        }
        System.out.println("¿desea volver a intentar?");
        resp = Lectura.next();

    }while(resp.equals("si"));
    System.out.println("FIN DEL JUEGO");
        Lectura.close();
    }
}