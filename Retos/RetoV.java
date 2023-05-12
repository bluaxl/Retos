package Retos;
import java.util.Scanner;
public class RetoV {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String mes;
        int dia;
        System.out.println("digite el mes en el que nacio");
        mes = lectura.nextLine();
        System.out.println("digite el mes en el que nacio");
        dia = lectura.nextInt();
        switch (mes.toLowerCase()) {
            case "enero":
                if (dia>=1 && dia<20) {
                    System.out.println("Tu signo zodiacal es CAPRICORNIO");
                    System.out.println("Capricornio es un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancolía");
                }
                else if(dia>=21 && dia<=31){
                    System.out.println("Tu signo zodiacal es ACUARIO");
                    System.out.println("Acuario es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual");
                }
            break;
            case "febrero":
                if (dia>=1 && dia<19) {
                    System.out.println("Tu signo zodiacal es ACUARIO");
                    System.out.println("Acuario es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual");
                }
                else if(dia>=20 && dia<=28){
                    System.out.println("Tu signo zodiacal es PISCIS");
                    System.out.println("Son personas muy cariñosas, por norma general, calmadas e intuitivas. Además, tienen muchísima imaginación, lo que les hará buenos en tareas relacionadas con las artes, aunque les abstraerá del mundo real más de lo que sería conveniente en determinadas ocasiones");
                }
            break;
            case "marzo":
                if (dia>=1 && dia<20) {
                    System.out.println("Tu signo zodiacal es PISCIS");
                    System.out.println("Son personas muy cariñosas, por norma general, calmadas e intuitivas. Además, tienen muchísima imaginación, lo que les hará buenos en tareas relacionadas con las artes, aunque les abstraerá del mundo real más de lo que sería conveniente en determinadas ocasiones");
                }
                else if(dia>=21 && dia<=31){
                    System.out.println("Tu signo zodiacal es ARIES");
                    System.out.println("Se caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas. Los Aries son de acción rápida y confían en su poder, por eso no pierden el tiempo pensando en problemas, de hecho, su manera de resolverlos es la acción");
                }
            break;
            case "abril":
                if (dia>=1 && dia<20) {
                    System.out.println("Tu signo zodiacal es ARIES");
                    System.out.println("Se caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas. Los Aries son de acción rápida y confían en su poder, por eso no pierden el tiempo pensando en problemas, de hecho, su manera de resolverlos es la acción");
                }
                else if(dia>=21 && dia<=30){
                    System.out.println("Tu signo zodiacal es TAURO");
                    System.out.println("La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas. Un Tauro es un ser decidido, pragmático y tiene una enorme fuerza de voluntad");
                }
            break;
            case "mayo":
            if (dia>=1 && dia<20) {
                System.out.println("Tu signo zodiacal es TAURO");
                System.out.println("La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas. Un Tauro es un ser decidido, pragmático y tiene una enorme fuerza de voluntad");
            }
            else if(dia>=21 && dia<=30){
                System.out.println("Tu signo zodiacal es GEMINIS");
                System.out.println("Géminis es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio");
            }
            break;
            case "junio":
            if (dia>=1 && dia<22) {
                System.out.println("Tu signo zodiacal es GEMINIS");
                System.out.println("Géminis es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio");
            }
            else if(dia>=23 && dia<=30){
                System.out.println("Tu signo zodiacal es CANCER");
                System.out.println("Son muy familiares, emocionales, intuitivos y espirituales, esto último puede ser un punto débil o una fortaleza según cómo lo canalicen. Son altamente soñadores y acostumbran a “montarse sus películas” en la cabeza, tendiendo a refugiarse demasiado en la fantasía");
            }
            break;
            case "julio":
            if (dia>=1 && dia<22) {
                System.out.println("Tu signo zodiacal es CANCER");
                System.out.println("Son muy familiares, emocionales, intuitivos y espirituales, esto último puede ser un punto débil o una fortaleza según cómo lo canalicen. Son altamente soñadores y acostumbran a “montarse sus películas” en la cabeza, tendiendo a refugiarse demasiado en la fantasía");
            }
            else if(dia>=23 && dia<=31){
                System.out.println("Tu signo zodiacal es VIRGO");
                System.out.println("Virgo es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa");
            }
            break;
            case "septiembre":
            if (dia>=1 && dia<22) {
                System.out.println("Tu signo zodiacal es VIRGO");
                System.out.println("Virgo es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa");
            }
            else if(dia>=23 && dia<=30){
                System.out.println("Tu signo zodiacal es LIBRA");
                System.out.println("Libra es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zodíaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble");
            }
            break;
            case "octubre":
            if (dia>=1 && dia<22) {
                System.out.println("Tu signo zodiacal es LIBRA");
                System.out.println("Libra es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zodíaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble");
            }
            else if(dia>=23 && dia<=31){
                System.out.println("Tu signo zodiacal es ESCORPIO");
                System.out.println("Escorpio es un signo fijo y de agua; su potencia y energía emocional son únicas en todo el zodíaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno");
            }
            break;
            case "noviembre":
            if (dia>=1 && dia<21) {
                System.out.println("Tu signo zodiacal es ESCORPIO");
                System.out.println("Escorpio es un signo fijo y de agua; su potencia y energía emocional son únicas en todo el zodíaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno");
            }
            else if(dia>=22 && dia<=30){
                System.out.println("Tu signo zodiacal es SAGITARIO");
                System.out.println("Sagitario es uno de los signos más brillantes y positivos del zodiaco. Las personas Sagitario suelen ser de carácter aventurero y emprendedor, con la mente abierta y siempre dispuestas a conocer a nuevas personas o a vivir experiencias diferentes. Son intuitivos, buenos organizadores y muy generosos");
            }
            break;
            case "diciembre":
            if (dia>=1 && dia<21) {
                System.out.println("Tu signo zodiacal es SAGITARIO");
                System.out.println("Sagitario es uno de los signos más brillantes y positivos del zodiaco. Las personas Sagitario suelen ser de carácter aventurero y emprendedor, con la mente abierta y siempre dispuestas a conocer a nuevas personas o a vivir experiencias diferentes. Son intuitivos, buenos organizadores y muy generosos");
            }
            else if(dia>=22 && dia<=31){
                System.out.println("Tu signo zodiacal es CAPRICORNIO");
                    System.out.println("Capricornio es un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancolía");
                }
            break;
            default:
            System.out.println("ERROR DE DIGITACION, VUELVA A INTENTAR");
                break;
        }
        lectura.close();
    }
}
