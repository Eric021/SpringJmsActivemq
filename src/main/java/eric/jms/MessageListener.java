package eric.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

public class MessageListener implements javax.jms.MessageListener {
    @Override
    public void onMessage(Message message) {

        if (message instanceof TextMessage) {

            try {
                String msgText = ((TextMessage) message).getText();
                System.out.println(msgText);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
