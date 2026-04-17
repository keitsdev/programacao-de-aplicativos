package Abstracao_09;
import java.util.Scanner;

public class MainImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um texto...");
        String texto = sc.nextLine();

        System.out.println("Opções de impressão:");
        System.out.println("1 - Impressão a laser");
        System.out.println("2 - Impressão à tinta");
        System.out.println();
        System.out.print("Informe a opção desejada: ");
        int op = sc.nextInt();

        switch(op){
            case 1:
                ImpressoraLaser l = new ImpressoraLaser();
                l.imprimir(texto);
                break;

            case 2:
                ImpressoraJatoTinta t = new ImpressoraJatoTinta();
                t.imprimir(texto);
                break;
        }
    }
}
