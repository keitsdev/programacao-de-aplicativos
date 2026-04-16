package Abstracao_06;
import java.util.Scanner;

public class MainDisp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dispositivos disponíveis:");
        System.out.println("1 - Televisão");
        System.out.println("2 - Computador");

        System.out.println("Escolha o dispositivo desejado:");
        int op = sc.nextInt();

        switch(op){
            case 1:
                Televisao tv = new Televisao();
                tv.ligar();
                System.out.println("Vai se alienar...");
                tv.desligar();
                break;
            case 2:
                Computador pc = new Computador();
                pc.ligar();
                System.out.println("ae filhao so nos compiuter kkkk");
                pc.desligar();
                break;
        }
    }
}