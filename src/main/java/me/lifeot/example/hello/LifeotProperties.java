package me.lifeot.example.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "lifeot")
@Validated
public class LifeotProperties {

    @NotEmpty
    private String name;

    private List<MyPojo> myPojo;

    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTimeout;

    private Duration readTimeout;

    @Min(0)
    @Max(100)
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyPojo> getMyPojo() {
        return this.myPojo;
    }

    public void setMyPojo(List<MyPojo> myPojo) {
        this.myPojo = myPojo;
    }

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public Duration getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
    }

}
