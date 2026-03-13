public class MainHeranca {
    public static void main(String[] args){
        Funcionario func1 = new Funcionario("Yuri", 19, "Auxiliar Administrativo");
        Cliente cl1 = new Cliente("Fran", 19, "franjas@gmail.com");

        func1.exibirDados();
        cl1.exibirDados();
    }
}