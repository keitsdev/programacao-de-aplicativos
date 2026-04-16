class CartaoCredito implements Pagamento {
    public void pagar(double valor){
        System.out.println("Pagamento no valor de " + valor + " realizado com sucesso no Cartão de Crédito!");
    }
}