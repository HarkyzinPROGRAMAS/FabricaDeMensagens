interface Notificacao{
    void enviar(String mensagem);
}

class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando E-mail: " + mensagem);
    }
}

class NotificacaoSMS implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando SMS: " + mensagem);
    }
}

class NotificacaoPush implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando notificação Push: " + mensagem);
    }
}

abstract class FabricaNotificacao{
    public abstract Notificacao criarNotificacao();

    public void notificar(String mensagem){
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}

class FabricaEmail extends FabricaNotificacao{
    @Override
    public Notificacao criarNotificacao(){
        return new NotificacaoEmail();
    }
}

class FabricaSMS extends FabricaNotificacao{
    @Override
    public Notificacao criarNotificacao(){
        return new NotificacaoSMS();
    }
}

class FabricaPush extends FabricaNotificacao{
    @Override
    public Notificacao criarNotificacao(){
        return new NotificacaoPush();
    }
}

