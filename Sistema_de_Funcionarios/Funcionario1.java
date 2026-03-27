class Funcionario1 {
    private String nome;
    private double salario;

    Funcionario1(){

    }

    Funcionario1(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    void calcularSalario(){
        System.out.println("Salário atual: " + this.salario);
    }
}