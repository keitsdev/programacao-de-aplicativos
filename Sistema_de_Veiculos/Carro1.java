class Carro1 extends Veiculo1 {
    Carro1(String marca){
        super(marca);
    }

    @Override
    void ligar(){
        System.out.println("Carro ligado.");
    }
}