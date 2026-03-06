import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double valor = 0;
        int op = 0;

        ContaBancaria cb1 = new ContaBancaria("296967", "Yuri Santos", 30.33);
        System.out.println("Número da conta: " + cb1.getNumeroConta() + "  Nome do titular: " + cb1.getTitular() + "  Saldo: " + cb1.getSaldo());

        System.out.println("O que deseja realizar hoje?");
        System.out.println("1. Depósito");
        System.out.println("2. Saque");
        op = sc.nextInt();

        switch(op){
            case 1:
                System.out.println("Insira o valor que deseja depositar: ");
                valor = sc.nextFloat();
                cb1.deposito();
                System.out.println("Saldo atual: " + cb1.getSaldo());
                break;
            case 2:
                System.out.println("Insira o valor que deseja sacar: ");
                valor = sc.nextFloat();
                cb1.saque();
                System.out.println("Saldo atual: " + cb1.getSaldo());
                break;
        }
    }
}