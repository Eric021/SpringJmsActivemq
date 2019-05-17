//package eric;
//
//
//import eric.jms.ChatTopic;
//import eric.jms.MessageReceiver;
//import eric.jms.MessageSender;
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.jms.annotation.EnableJms;
//
//import javax.jms.JMSException;
//import javax.jms.TopicConnection;
//import java.io.IOException;
//
////@SpringBootApplication
////@EnableJms
//public class Main {
//
//
////    @Bean
////    public JmsListenerContainerFactory myFactory(ConnectionFactory connectionFactory,
////                                                 DefaultJmsListenerContainerFactoryConfigurer configurer) {
////
////        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
////        configurer.configure(factory, connectionFactory);
////        return factory;
////    }
////
////    @Bean
////    public MessageConverter jacksonJmsMessageConverter() {
////
////        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
////        converter.setTargetType(MessageType.TEXT);
////        converter.setTypeIdPropertyName("_type");
////        return converter;
////    }
////
////    public static void main(String[] args) {
////        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
////        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
////        jmsTemplate.convertAndSend(keyNames.DEST.getValue(), new JmsMessage(args[0]));
////
////    }
//
//
//    public static void main(String[] args) throws IOException, JMSException {
//
////        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
////                AppConfig.class);
////
////        if (args.length <= 0)
////            return;
////
////
////        String userId = args[0];
////
////        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
////        TopicConnection topicConnection = connectionFactory.createTopicConnection();
////
////        ChatTopic chatTopic = new ChatTopic();
////        MessageSender sender = new MessageSender();
////        sender.publish(topicConnection, chatTopic, userId);
////
////        MessageReceiver receiver = new MessageReceiver();
////        receiver.subscribe(topicConnection, chatTopic, userId);
////    }
//
//}
