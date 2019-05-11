package me.lifeot.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    HttpMessageConverters converters;

    @RequestMapping("/")
    public String index() {

        converters.getConverters().forEach(c -> System.out.println(c.getClass() + " " + c.toString()));
        return "Hello Spring MVC";
    }
}
