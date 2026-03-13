class Cachorro extends Animal {
    private String raca;

    Cachorro(String nome, double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public void exibirAnimais(){
        System.out.println("Nome: " + this.getNome() + "  Peso: " + this.getPeso() + "  Raça: " + this.raca);
    }
}