class Carro {
    private String marca;
    private int velAtual;
    private int velMax;

    Carro(){
        this.velAtual = 0;
        this.velMax = 0;
    }

    Carro(String marca, int velAtual, int velMax){
        this.marca = marca;
        this.velAtual = velAtual;
        this.velMax = velMax;
    }

    public void acelerar(int valor){
        if (valor >= this.velMax && valor + this.velAtual >= this.velMax) {
            this.velAtual = this.velMax;
            System.out.println("Velocidade Atual: " + this.velAtual);
            return;
        } else {
            this.velAtual += valor;
            System.out.println("Velocidade Atual: " + this.velAtual);
            return;
        }
    }

    public void frear(int valor){
        if (valor < 0) {
            this.velAtual = 0;
            System.out.println("Velocidade Atual: " + this.velAtual);
            return;
        } else {
            this.velAtual -= valor;
            System.out.println("Velocidade Atual: " + this.velAtual);
            return;
        }
    }

    public int getVelAtual() {
        return this.velAtual;
    }


}
