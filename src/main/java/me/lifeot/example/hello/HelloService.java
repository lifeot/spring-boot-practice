package me.lifeot.example.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${lifeot.name}")
    String name;

    public String getMessage() {
        return "Hello, " + name;
    }

//    @PostConstruct
//    public void init() {
//        throw new RuntimeException("Intended Exception");
//    }
}
