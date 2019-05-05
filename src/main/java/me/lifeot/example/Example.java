package me.lifeot.example;

import me.lifeot.example.hello.HelloService;
import me.lifeot.example.hello.LifeotProperties;
import me.lifeot.example.hello.MyBean;
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

    @Autowired
    LifeotProperties lifeotProperties;

    @Autowired
    MyBean myBean;

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }

    @RequestMapping("/")
    public String hello() {
        System.out.println(myBean.getMessage());
        System.out.println(lifeotProperties.getName());
        System.out.println(lifeotProperties.getMyPojo().size());
        System.out.println(lifeotProperties.getSessionTimeout());
        System.out.println(lifeotProperties.getReadTimeout());
        return helloService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Example.class);

        application.setBanner(new MyBanner());
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}
