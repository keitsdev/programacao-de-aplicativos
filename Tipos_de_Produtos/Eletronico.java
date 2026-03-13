class Eletronico extends Produto {
    private String garantia;

    Produto(String nome, float preco, String garantia){
        super(nome, preco);
        this.garantia = garantia;
    }

    public String getGarantia(){
        return this.garantia;
    }

    public void setGarantia(String garantia){
        this.garantia = garantia;
    }

    @Override
    public void mostrarProd(){
        System.out.println("Produto: " + this.getNome() + "  Preço: " + this.getPreco() + "  Garantia: " + this.garantia);
    }
}
