import java.util.Scanner;

public class MainLegal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário:");
        double salario = sc.nextDouble();

        System.out.println("Cargos disponíveis:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("Informe o cargo:");
        int op = sc.nextInt();

        switch(op){
            case 1:
                GerenteLegal gerente = new GerenteLegal();
                gerente.calcularBonus(salario);
                break;
            case 2:
                VendedorLegal vendedor = new VendedorLegal();
                vendedor.calcularBonus(salario);
                break;
        }
    }
}