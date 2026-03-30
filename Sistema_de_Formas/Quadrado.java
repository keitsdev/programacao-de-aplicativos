class Quadrado extends Forma {
    private double lado;

    @Override
    void calcularArea(double lado){
        System.out.println("O valor da área do quadrado é: " + (this.lado ^ 2));
    }
}