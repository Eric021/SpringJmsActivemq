package eric.service;

import eric.jms.MessageSender;
import eric.pojos.JmsMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("JmsService")
public class JmsServiceImpl implements JmsService {

    @Autowired
    MessageSender messageSender;

    @Override
    public void sendMsg(JmsMessage message) {

        messageSender.sendMsg(message.getText());
    }
}
