class Carro1 extends Veiculo1 {
    Carro1(String marca){
        super(marca);
    }

<<<<<<< HEAD
    @Overload
    void ligar(boolean chavePresencial){
        System.out.println("Carro ligado.");
    }
}
=======
    @Override
    void ligar(){
        System.out.println("Carro ligado.");
    }
}
>>>>>>> 04c0746a7db3472e85dbfbeaa48b97510c609fc4