class Animal2 {
    private String nome;
    private int vezes;

    Animal2(String nome, int vezes){
        this.nome = nome;
        this.vezes = vezes;
    }

    public int getVezes(){
        return this.vezes;
    }

    public void emitirSom(){
        System.out.println("O animal emite um som.");
    }
}