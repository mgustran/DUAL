package injection.e1e2e4;

import config.E1Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by dawdual on 8/05/17.
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(E1Config.class);
        MessageManager manager = context.getBean(MessageManager.class);
        manager.addMessage("1", "mecagontó");
        System.out.println(manager.findMessage("1"));
        ((AbstractApplicationContext)context ).close();
    }
}
