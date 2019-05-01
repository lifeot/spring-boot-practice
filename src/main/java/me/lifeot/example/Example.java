package me.lifeot.example;

import me.lifeot.example.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author choikimoon
 */
@RestController
@SpringBootApplication
public class Example {

    @Autowired
    HelloService helloService;

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }

    @RequestMapping("/")
    public String hello() {
        return helloService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Example.class);
        application.setBanner(new MyBanner());
        application.setBannerMode(Banner.Mode.OFF);
        application.addListeners(new MyListener());
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}
