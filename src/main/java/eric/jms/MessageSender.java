package eric.jms;

import eric.pojos.JmsMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


@Component
public class MessageSender {


    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMsg(JmsMessage message) {
        jmsTemplate.send(ChatTopic.dest_name, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(message);
            }
        });
    }

//    public void publish(TopicConnection connection, Topic chatTopic, String userId) throws JMSException {
//
//        TopicSession session = null;
//        try {
//            session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
//            TopicPublisher publisher = session.createPublisher(chatTopic);
//            getMsgInput(publisher, connection, session, userId);
//        } catch (JMSException e) {
//            e.printStackTrace();
//        }
//    }

//    private void getMsgInput(TopicPublisher publisher, TopicConnection connection, TopicSession session, String userId) {
//
//        InputStreamReader stream = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(stream);
//
//        try {
//            String msgToSend = reader.readLine();
//            if (msgToSend.equalsIgnoreCase("exit"))
//                connection.close();
//
//            else {
//
//                TextMessage message = session.createTextMessage();
//                message.setText(userId + " : " + msgToSend);
//                publisher.publish(message);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
