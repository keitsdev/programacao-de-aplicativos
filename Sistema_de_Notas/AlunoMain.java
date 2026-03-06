public class AlunoMain {
    public static void main(String[] args) {

        Aluno a = new Aluno("Yuri Santos", 7.0, 6.7, 8.2);

        System.out.println("Nome do Estudante: " + a.getName() + "  Situação: " + a.getNotas());
    }
}