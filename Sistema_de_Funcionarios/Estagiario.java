class Estagiario extends Funcionario1 {
    Estagiario(String nome, double salario){
        super(nome, salario);
    }

    @Override
    void calcularSalario(){
        System.out.println("Slaário atual: " + this.getSalario());
    }
}