public class FMain {
    public static void main(String[] args) {
        Funcionario1 f[] = {
            new Funcionario1(),
            new Gerente("Pedro", 5780, 2000),
            new Estagiario("Yuri", 2560)
        };
        for (Funcionario1 a : f){
            a.calcularSalario();
        }
    }
}