package server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.Socket;

@Configuration
public class SpringConfig {
    @Bean
    public Server server() {
        return new Server(authService());
    }

    @Bean
    public AuthService authService() {
        return new SimpleAuthService();
    }
}
