package eric.jms;

import eric.pojos.JmsMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.*;

@Component
public class MessageReceiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(JmsMessage message) {
        System.out.println("Received <" + message.getText() + ">");
    }

//    public void subscribe(TopicConnection topicConnection, ChatTopic topic, String userId) throws JMSException {
//
//
//        TopicSession session = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
//        TopicSubscriber subscriber = session.createSubscriber(topic);
//        subscriber.setMessageListener(new MessageListener());
//    }


//    @JmsListener(destination = "chatTest_1")
//    public void receive1(String message) {
//        System.out.println(message);
//    }
}
