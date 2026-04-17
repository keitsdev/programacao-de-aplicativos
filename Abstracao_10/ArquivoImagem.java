package Abstracao_10;

class ArquivoImagem implements Arquivo {
    public void abrir(){
        System.out.println("Arquivo de imagem aberto!");
    }

    public void fechar(){
        System.out.println("Arquivo de imagem fechado!");
    }
}
