class Correios implements Entrega {
    public void calcularFrete(double peso){
        System.out.println("Frete pelos Correios: " + (peso * 0.2));
    }
}