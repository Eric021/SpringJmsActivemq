package eric.jms;

import javax.jms.JMSException;
import javax.jms.Topic;

public class ChatTopic implements Topic {

    public static final String dest_name = "cahtTest";
    @Override
    public String getTopicName() throws JMSException {
        return "chatTest";
    }
}
