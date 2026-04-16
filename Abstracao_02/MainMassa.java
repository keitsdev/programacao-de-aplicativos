import java.util.Scanner;

public class MainMassa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veículos disponíveis:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");

        System.out.println("Qual veículo deseja utilizar?");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                CarroMassa hotwheels = new CarroMassa();
                hotwheels.ligar();
                System.out.println("Vroom... Vroom...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Você chegou ao seu destino!");
                hotwheels.desligar();
                break;

            case 2:
                MotoMassa cinquentinha = new MotoMassa();
                cinquentinha.ligar();
                System.out.println("Randandandandandandan...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Você chegou ao seu destino!");
                cinquentinha.desligar();
                break;
        }
    }
}