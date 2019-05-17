package eric.service;

import eric.pojos.JmsMessage;

public interface JmsService {

    void sendMsg(JmsMessage message);
}
