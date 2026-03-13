class Veiculo {
    private String marca;
    private int ano;

    Veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void exibirInfos(){
        System.out.println("Marca: " + this.marca + "  Ano: " + this.ano);
    }
}