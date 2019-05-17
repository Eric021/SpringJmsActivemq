package eric;

import eric.jms.ChatConfigue;
import eric.pojos.JmsMessage;
import eric.service.JmsService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@Import(ChatConfigue.class)
@EnableJms
public class WebApplication {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                WebApplication.class);

        JmsService jmsService = (JmsService) context.getBean("JmsService");
        JmsMessage jmsMessage = new JmsMessage("this is test for broadcast topic");
        jmsService.sendMsg(jmsMessage);
    }
}
