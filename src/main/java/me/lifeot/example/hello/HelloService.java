package me.lifeot.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    LifeotProperties lifeotProperties;

    public String getMessage() {
        return "Hello, " + lifeotProperties.getName() + " " + lifeotProperties.getMyPojo().size();
    }

//    @PostConstruct
//    public void init() {
//        throw new RuntimeException("Intended Exception");
//    }
}
