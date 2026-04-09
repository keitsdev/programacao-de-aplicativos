class Aparelho {
    private String nome;

    Aparelho(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void iniciar(){
        System.out.println("Iniciando...");
    }

    public void desligar(){
        System.out.println("Encerrando...");
    }

    public void reiniciar(){
        System.out.println("Reiniciando aparelho, aguarde...");
    }

    public void carregar(){
        System.out.println("Carregador conectado");
    }

    public void showDados(){
        System.out.println("Nome do aparelho: " + this.nome);
    }

    /*public void showDados(String nome, String musica, String duracao){
        System.out.println("Nome: " + this.nome + "  Música atual: " + this.musica + "  Duração: " + this.duracao);
    }*/

}