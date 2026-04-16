package Abstracao_04;
import java.util.Scanner;

public class Circulo1 {

    Scanner sc = new Scanner(System.in);
    private double raio;

    public void setRaio(){
        System.out.println("Informe a medida do raio:");
        this.raio = sc.nextDouble();
    }

    public void calcularArea(){
        System.out.println("Área do círculo: " + (3.14 * (this.raio * this.raio)));
    }
}
