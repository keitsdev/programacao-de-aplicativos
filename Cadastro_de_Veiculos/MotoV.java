class MotoV extends Veiculo {
    private int cilindradas;

    MotoV(String marca, int ano, int cilindradas){
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return this.cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfos(){
        System.out.println("Marca da moto: " + this.getMarca() + "  Ano: " + this.getAno() + "  Cilindradas: " + this.cilindradas);
    }
}