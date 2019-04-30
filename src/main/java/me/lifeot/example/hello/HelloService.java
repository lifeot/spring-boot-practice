package me.lifeot.example.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Hello Spring Boot 2.0";
    }
}
