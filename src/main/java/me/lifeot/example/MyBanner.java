package me.lifeot.example;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class MyBanner implements Banner {

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println("My little banner");
    }
}
