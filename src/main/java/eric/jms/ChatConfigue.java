package eric.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import java.util.Arrays;

@Configuration
public class ChatConfigue {

    @Value("tcp://localhost:61616")
    private String brokerUrl;

    @Bean
    public ActiveMQConnectionFactory connectionFactory() {
        System.out.println("broker url " + this.brokerUrl);
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(this.brokerUrl);
        connectionFactory.setTrustedPackages(Arrays.asList("com.websystique.spring"));
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {

        System.out.println("jmsTemplate method");
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactory());
        jmsTemplate.setPubSubDomain(true);
        return jmsTemplate;
    }

}
