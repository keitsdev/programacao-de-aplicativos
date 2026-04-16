package Abstracao_05;

class Email implements Notificacao {
    public void enviarMensagem(String msg){
        System.out.println("E-mail enviado!");
        System.out.println("Mensagem: " + msg);
    }
}
