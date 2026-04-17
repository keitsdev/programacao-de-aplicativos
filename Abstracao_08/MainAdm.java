package Abstracao_08;
import java.util.Scanner;

public class MainAdm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== TELA DE LOGIN =====");
        System.out.print("Usuário: ");
        String usuario = sc.next();
        System.out.print("Senha: ");
        String senha = sc.next();

        System.out.println();
        System.out.println("===== CARGOS =====");
        System.out.println("1 - Usuário Comum");
        System.out.println("2 - Administrador");
        System.out.print("Informe o seu cargo: ");
        int op = sc.nextInt();

        switch(op){
            case 1:
                UsuarioComum user = new UsuarioComum();
                user.login(usuario, senha);
                break;

            case 2:
                Administrador adm = new Administrador();
                adm.login(usuario, senha);
                break;
        }
    }
}
