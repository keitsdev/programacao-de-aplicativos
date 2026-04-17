import java.util.Scanner;

public class MainEnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informa o peso da compra:");
        double peso = sc.nextDouble();

        System.out.println("Meios de entrega:");
        System.out.println("1 - Correios");
        System.out.println("2 - Transportadora");
        System.out.println("Informe o meio de entrega desejado:");
        int op = sc.nextInt();

        switch(op){
            case 1:
                Correios c = new Correios();
                c.calcularFrete(peso);
                break;
            case 2:
                Transportadora t = new Transportadora();
                t.calcularFrete(peso);
                break;
        }
    }
}