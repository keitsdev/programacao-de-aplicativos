package Abstracao_08;

class UsuarioComum implements Autenticacao {
    public void login(String usuario, String senha){
        System.out.println("Usuário logado com sucesso!");
    }
}
