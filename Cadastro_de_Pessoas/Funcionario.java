class Funcionario extends Pessoa {
    private String cargo;

    Funcionario(String nome, int idade, String cargo){
        super(nome, idade);
        this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}