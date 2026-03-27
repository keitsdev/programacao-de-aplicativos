class Gerente extends Funcionario1 {
    private double bonus;

    Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    void calcularSalario(){
        System.out.println("Salário atual: " + (this.getSalario() + this.bonus));
    }
}