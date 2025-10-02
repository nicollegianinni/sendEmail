package email.send.consumers;

public class EmailConsumer {

    public  void listenEmailQueue(@Payload String string){
        System.out.println("**************Teste*****************");
        System.out.println(string);
    }
}
