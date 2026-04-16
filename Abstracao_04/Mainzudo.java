package Abstracao_04;
import java.util.Scanner;

public class Mainzudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Formas disponíveis:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Círculo");
        System.out.println("Diga a forma desejada:");
        int op = sc.nextInt();

        switch(op){
            case 1:
                Quadrado1 quadrado = new Quadrado1();
                quadrado.setLado();
                quadrado.calcularArea();
                break;

            case 2:
                Circulo1 circulo =  new Circulo1();
                circulo.setRaio();
                circulo.calcularArea();
                break;
        }
    }
    
}
