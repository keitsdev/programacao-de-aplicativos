class CarroV extends Veiculo {
    private int portas;

    CarroV(String marca, int ano, int portas){
        super(marca, ano);
        this.portas = portas;
    }

    public int getPortas(){
        return this.portas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    @Override
    public void exibirInfos(){
        System.out.println("Marca do carro: " + this.getMarca() + "  Ano: " + this.getAno() + "  Quantidade de portas: " + this.portas);
    }
}