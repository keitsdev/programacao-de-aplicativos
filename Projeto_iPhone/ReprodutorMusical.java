class ReprodutorMusical extends Aparelho {
    private String musica;
    private String duracao;

    ReprodutorMusical(String nome, String musica, String duracao){
        super(nome);
        this.musica = musica;
        this.duracao = duracao;
    }

    public void selecionarMusica(String musica){
        this.musica = musica;
    }

    public void tocar(){
        System.out.println("Reproduzindo agora: " + this.musica);
    }

    public void pausar(){
        System.out.println(this.musica + "em pausa...");
    }

    public void pular(){
        System.out.println("Título pulado.");
    }

    @Override
    public void showDados(){
        System.out.println("Nome: " + this.getNome() + " Reproduzindo agora: " + this.musica + "  Tempo de duração: " + this.duracao);
    }

}