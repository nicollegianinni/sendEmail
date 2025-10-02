package email.send.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMQConfig {
    @Value("${broker.queue.email.name}")
    private String queue;
    public Queue queue (){
        return new Queue(queue,true);
    }
}