class Aluno {
    private String name;
    private double[] notas;

    Aluno(){
        this.notas[3] = 0;
    }

    Aluno(String nome, double av1, double av2, double av3){
        this.name = nome;
        this.notas[3] = notas[3];
    }

    public void calcularMedia (double media, double av1, double av2, double av3){

        if (av1 < 0 || av2 < 0 || av3 < 0 || av1 > 10 || av2 > 10 || av3 > 10){
            System.out.println("Nota inválida.");
        } else {
            media = (av1 + av2 + av3) / 3;
            this.notas = media;

            if (media >= 7 && media <= 10){
                System.out.println("Aluno aprovado com média igual a " + this.notas + "!");
            } else {
                System.out.println("Aluno reprovado com média igual a " + this.notas + ".");
            }
        }
    }

    public String getName(String name){
        return this.name;
    }

    public double getNotas(double notas){
        return this.notas[];
    }

}