package mediatorPattern;

import java.util.Date;

/**
 * Created by mgustran on 02/05/2016.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
