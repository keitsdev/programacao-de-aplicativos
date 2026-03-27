class Gato2 extends Animal2 {
    Gato2(String nome, int vezes){
        super(nome, vezes);
    }

    @Override
    public void emitirSom(){
        System.out.println("O gato diz: 'Miau' " + this.getVezes() + " vezes!");
    }
}