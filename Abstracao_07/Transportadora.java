class Transportadora implements Entrega {
    public void calcularFrete(double peso){
        System.out.println("Frete pela Transportadora: " + (peso * 0.5));
    }
}