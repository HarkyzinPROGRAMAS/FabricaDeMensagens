public class Main {
    public static void main(String[] args){
        FabricaNotificacao fabricaEmail = new FabricaEmail();
        fabricaEmail.notificar("Seu pedido foi confirmado");

        FabricaNotificacao fabricaSMS = new FabricaSMS();
        fabricaSMS.notificar("Código de validação: 2902");

        FabricaNotificacao fabricaPush = new FabricaPush();
        fabricaPush.notificar("Você recebeu uma nova mensagem");
    }
}
