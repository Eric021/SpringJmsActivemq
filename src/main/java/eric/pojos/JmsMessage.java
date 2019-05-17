package eric.pojos;

import java.io.Serializable;

public class JmsMessage implements Serializable{

    private String text;

    public JmsMessage(String text) {

        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
