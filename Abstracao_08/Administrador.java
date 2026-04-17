package Abstracao_08;

class Administrador implements Autenticacao {
    public void login(String usuario, String senha) {
        System.out.println("Administrador logado com sucesso!");
    }
}