class Animal {
    private String nome;
    private double peso;

    Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void exibirAnimais(){
        System.out.println("Nome: " + this.nome + "  Peso: " + this.peso);
    }
}