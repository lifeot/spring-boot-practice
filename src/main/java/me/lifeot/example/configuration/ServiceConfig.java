package me.lifeot.example.configuration;

import me.lifeot.example.user.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
