package config;

import injection.e1e2e4.MessageManager;
import injection.e1e2e4.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dawdual on 8/05/17.
 */

@Configuration
public class E2Config {

    @Bean
    public MessageService messageService() { return new MessageService(); }

    @Bean
    public MessageManager messageManager() { return new MessageManager(); }
}
