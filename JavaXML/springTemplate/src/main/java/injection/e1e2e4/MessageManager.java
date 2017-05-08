package injection.e1e2e4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dawdual on 8/05/17.
 */

@Component
public class MessageManager {

    private MessageService messageService1;

    private MessageService messageService2;

    @Autowired
    public void setMessageService1(MessageService messageService1) {
        this.messageService1 = messageService1;
    }

    @Autowired
    public void setMessageService2(MessageService messageService2) {
        this.messageService2 = messageService2;
    }

    public void addMessage(String key, String message) {
        messageService1.add(key, message);
    }

    public String findMessage(String key) {
        return messageService2.message(key);
    }
}
