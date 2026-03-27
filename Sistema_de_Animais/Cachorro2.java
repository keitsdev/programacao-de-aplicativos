class Cachorro2 extends Animal2 {
    Cachorro2(String nome, int vezes){
        super(nome, vezes);
    }

    @Override
    public void emitirSom(){
        System.out.println("O cachorro diz: 'Au, au' " + this.getVezes() + " vezes!");
    }
}