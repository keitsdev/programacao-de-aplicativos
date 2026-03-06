class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    ContaBancaria(){ //construtor padrao
        saldo = 0;
    }

    ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getValor(double valor){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void deposito(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
            return;
        } else {
            System.out.println("Não é possível realizar o depósito.");
        }
    }

    public void saque(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;

            int c100, c50, c20, c10, c5, c2, c1;
            int r100, r50, r20, r10, r5, r2;

            c100 = (int)valor / 100;
            r100 = (int)valor % 100;

            c50 = r100 / 50;
            r50 = r100 % 50;

            c20 = r50 / 20;
            r20 = r50 % 20;

            c10 = r20 / 10;
            r10 = r20 % 10;

            r5 = r10 / 5;
            r5 = r10 % 5;

            r2 = r5 / 2;
            r2 = r5 % 2;

            System.out.println("Saque realizado com sucesso!");
            System.out.println(r100 + " cédulas de 100");
            System.out.println(r50 + " cédulas de 50");
            System.out.println(r20 + " cédulas de 20");
            System.out.println(r10 + " cédulas de 10");
            System.out.println(r5 + " cédulas de 5");
            System.out.println(r2 + " cédulas de 2");

            return;
        } else {
            System.out.println("Não é possível realizar o saque.");
        }
    }

}