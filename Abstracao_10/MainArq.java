package Abstracao_10;
import java.util.Scanner;

public class MainArq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipos de arquivo disponíveis:");
        System.out.println("1 - Arquivo de Texto");
        System.out.println("2 - Arquivo de Imagem");
        System.out.print("Informe o tipo de arquivo desejado: ");
        int op = sc.nextInt();

        if(op == 1){
            ArquivoTexto at = new ArquivoTexto();
            at.abrir();
            System.out.println("=== CONTEUDO ===");
            at.fechar();
            return;
        } else{
            ArquivoImagem ai = new ArquivoImagem();
            ai.abrir();
            System.out.println("=== CONTEUDO ===");
            ai.fechar();
            return;
        }
    }
}
