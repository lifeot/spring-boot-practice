package me.lifeot.example.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Hello World";
    }

//    @PostConstruct
//    public void init() {
//        throw new RuntimeException("Intended Exception");
//    }
}
