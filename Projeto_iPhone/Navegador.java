class Navegador extends Aparelho{
    private String url;
    private String pesquisa;

    Navegador(String nome, String url, String pesquisa){
        super(nome);
        this.url = url;
        this.pesquisa = pesquisa;
    }

    public void exibirPagina(String url){
        System.out.println("Link do site: " + this.url);
    }

    public void pesquisar(String pesquisa){
        System.out.println("Resultados da sua pesquisa: " + this.pesquisa);
    }

    public void addAba(){
        System.out.println("Nova guia");
    }

    public void atualizarPag(){
        System.out.println("Página atualizada!");
    }

    @Override
    public void showDados(){
        System.out.println("Nome: " + this.getNome() + "  URL: " + this.url + "  Conteúdo da pesquisa: " + this.pesquisa);
    }
}