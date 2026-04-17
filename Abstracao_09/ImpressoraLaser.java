package Abstracao_09;

class ImpressoraLaser implements Impressora {
    public void imprimir(String texto){
        System.out.println("Impressão a laser realizada com sucesso!");
        System.out.println("Conteúdo impresso: " + texto);
    }
}