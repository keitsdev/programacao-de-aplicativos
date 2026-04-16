package Abstracao_05;

class SMS implements Notificacao {
    public void enviarMensagem(String msg){
        System.out.println("SMS enviado!");
        System.out.println("Mensagem: " + msg);
    }
}
