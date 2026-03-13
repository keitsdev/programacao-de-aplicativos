class Alimento extends Produto {
    private String dataValidade;

    Alimento(String nome, float preco, String dataValidade){
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getValidade(){
        return this.dataValidade;
    }

    public void setValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    @Override
    public void mostrarProd(){
        System.out.println("Produto: " + this.getNome() + "  Preço: " + this.getPreco() + "  Data de validade:" + this.dataValidade);
    }
}
