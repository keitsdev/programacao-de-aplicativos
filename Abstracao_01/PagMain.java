import java.util.Scanner;

public class PagMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do pagamento: ");
        double valor = sc.nextDouble();

        System.out.println("Métodos de pagamento disponíveis:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2- Pix");
        System.out.println("Informe o método de pagamento:");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                CartaoCredito myCard = new CartaoCredito();
                myCard.pagar(valor);
                break;
            case 2:
                Pix myPix = new Pix();
                myPix.pagar(valor);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}