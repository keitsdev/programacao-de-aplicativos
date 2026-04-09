class Telefone extends Aparelho {
    private String userNum;
    private String otherNum;

    Telefone(String nome, String userNum, String otherNum){
        super(nome);
        this.userNum = userNum;
        this.otherNum = otherNum;
    }

    public void ligar(String otherNum){
        System.out.println(this.otherNum);
        System.out.println("Chamando...");
    }

    public void atender(){
        System.out.println("Ligação iniciada!");
    }

    public void caixaPostal(){
        System.out.println("CPM22");
    }

    @Override
    public void showDados(){
        System.out.println("Nome: " + this.getNome() + "  Número de telefone: " + this.userNum);
    }
}