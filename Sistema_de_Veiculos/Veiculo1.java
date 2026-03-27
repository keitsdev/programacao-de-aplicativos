class Veiculo1 {
    private String marca;

    Veiculo1(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    void ligar(){
        System.out.println("Veículo ligado!");
    }
}