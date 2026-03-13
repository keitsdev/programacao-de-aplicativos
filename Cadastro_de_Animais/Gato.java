class Gato extends Animal {
    private String cor;

    Gato(String nome, double peso, String cor){
        super(nome, peso);
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public void exibirAnimais(){
        System.out.println("Nome: " + this.getNome() + "  Peso: " + this.getPeso() + "  Cor: " + this.cor);
    }
}