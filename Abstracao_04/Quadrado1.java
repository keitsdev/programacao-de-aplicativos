package Abstracao_04;
import java.util.Scanner;

class Quadrado1 implements Forma1 {

    Scanner sc = new Scanner(System.in);
    private double lado;

    public void setLado(){
        System.out.println("Informe a medida do lado:");
        this.lado = sc.nextDouble();
    }

    public void calcularArea(){
        System.out.println("Área do quadrado: " + (this.lado * this.lado));
    }
}