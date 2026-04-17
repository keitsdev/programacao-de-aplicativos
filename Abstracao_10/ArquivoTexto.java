package Abstracao_10;

class ArquivoTexto implements Arquivo {
    public void abrir(){
        System.out.println("Aequivo de texto aberto!");
    }

    public void fechar(){
        System.out.println("Arquivo de texto fechado!");
    }
}