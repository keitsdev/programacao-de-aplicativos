package Abstracao_09;

class ImpressoraJatoTinta implements Impressora {
    public void imprimir(String texto){
        System.out.println("Impressão à tinta realizada com sucesso!");
        System.out.println("Conteúdo da impressão: " + texto);
    }
}