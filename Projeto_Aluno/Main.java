public class Main {
    public static void main(String[] args){
        Aluno a = new Aluno();

        a.setName("Yuri");
        System.out.println(a.getName());

        Aluno a2 = new Aluno("Ednaldo Pereira", 52, "3642934");
        System.out.println("Nome: " + a2.getName() + "  Idade: " + a2.getAge() + "  Matrícula: " + a2.getRegistration());
    }
}