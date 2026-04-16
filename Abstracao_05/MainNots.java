package Abstracao_05;
import java.util.Scanner;

public class MainNots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma mensagem...");
        String msg = sc.nextLine();

        System.out.println("Opções de comunicação:");
        System.out.println("1. E-mail");
        System.out.println("2. SMS");
        System.out.println("Informe a opção desejada:");
        int op = sc.nextInt();

        switch(op){
            case 1:
                Email email = new Email();
                email.enviarMensagem(msg);
                break;
            case 2:
                SMS sms = new SMS();
                sms.enviarMensagem(msg);
                break;
        }
    }
}
