package me.lifeot.example.hello;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class HelloService {

    public String getMessage() {
        return "Hello Spring Boot 2.0";
    }

//    @PostConstruct
//    public void init() {
//        throw new RuntimeException("Intended Exception");
//    }
}
