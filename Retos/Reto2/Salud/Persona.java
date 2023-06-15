package Reto2.Salud;

import java.util.Scanner;

public class Persona {
        private String tipoDoc;
        private int documento;
        private String nombre;
        private String apellido;
        private double peso;
        private double estatura;
        private int edad;
        private String sexo; 
    
        public double pedirDatos(){
            Scanner leer = new Scanner(System.in);
            System.out.println("digite el tipo de documento");
            tipoDoc = leer.next();
            System.out.println("digite el numero de documento");
            documento = leer.nextInt();
            System.out.println("digite el nombre");
            nombre = leer.next();
            System.out.println("digite el apellido");
            apellido = leer.next();
            System.out.println("digite el peso en kilogramos");
            peso =  leer.nextDouble();
            System.out.println("digite la estatura");
            estatura = leer.nextDouble();
            System.out.println("digite la edad");
            edad = leer.nextInt();
            System.out.println("digite el sexo");
            sexo = leer.next();
            leer.close();
            return peso;
        }
        public void mostrarPersona(){
            System.out.println("el tipo de documento es: "+ tipoDoc);
            System.out.println("el numero de documento es: "+ documento);
            System.out.println("el nombre es: "+nombre);
            System.out.println("el apellido es: "+apellido);
            System.out.println("el peso es de: "+peso);
            System.out.println("la estatura es de: "+estatura);
            System.out.println("la edad es de: "+edad);
            System.out.println("el sexo es de: "+sexo);
        }
        public double calcularmc(double pesoActual){
            pesoActual = peso/Math.pow(estatura, 2);
            return pesoActual;
        }
        public void mayorEdad(){
            if(edad>=18){
                System.out.println("es mayor de edad");
            }
            else if (edad>0 && edad<18){
                System.out.println("es menor de edad");
            }
            else{
                System.out.println("Error de digitacion");
            }
        }
}
