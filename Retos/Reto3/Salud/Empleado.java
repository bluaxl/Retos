package Reto3.Salud;
import java.util.Scanner;
public class Empleado extends Persona{
    private String cargo;
    private int valorhora;
    private int horastrabajadas;
    private String departamento;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

    public Empleado() {
    }
    

    public Empleado(String cargo, int valorhora, int horastrabajadas, String departamento) {
        this.cargo = cargo;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }

    public void calcularHonorarios(int valorhora, int horastrabajadas, String cargo){
        System.out.println("el tipo de documento es "+getTipoDoc());
        System.out.println("el numero del documento es "+getDocumento());
        System.out.println("el cargo que ejerce es "+cargo);
        System.out.println("la cantidad de horas trabajadas es de "+horastrabajadas+"h");
        System.out.println("el valor por hora es de: "+valorhora);

        double valortotal=(valorhora*horastrabajadas);
        valortotal = valortotal-(valortotal*0.966)/100;
        System.out.println("el valor total es de "+ valortotal);
    }

    public static void main(String[] args) {
        Empleado empl = new Empleado();
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el valor por hora: ");
        int valorhora = leer.nextInt();
        System.out.println("digite las horas trabajadas: ");
        int horastrabajadas = leer.nextInt();
        System.out.println("digite el cargo que ejerce: ");
        String cargo = leer.next();
        System.out.println("digite el tipo de documento: ");
        String tdoc = leer.next();
        empl.setTipoDoc(tdoc);
        System.out.println("digite el numero del documento: ");
        int ndoc = leer.nextInt();
        empl.setDocumento(ndoc);
        
        empl.calcularHonorarios(valorhora, horastrabajadas, cargo);
        leer.close();
    }   
}
