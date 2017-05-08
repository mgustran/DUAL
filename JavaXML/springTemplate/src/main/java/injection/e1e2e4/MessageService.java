package injection.e1e2e4;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dawdual on 8/05/17.
 */
@Service
public class MessageService {

    private Map<String, String> messagesMap;

    public MessageService() {
        messagesMap = new HashMap<>();
    }

    public String key(String message) {
        for (String key : messagesMap.keySet()) {
            if (messagesMap.get(key).equals(message)) {
                return message;
            }
        }return "miscojones";
    }

    public void add(String key, String message) {
        messagesMap.put(key, message);
    }

    public String message(String key) {
        return messagesMap.get(key);
    }
}
