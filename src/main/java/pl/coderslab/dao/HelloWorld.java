package pl.coderslab.dao;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class HelloWorld {

    public HelloWorld() {
        System.out.println("hello creating");
    }


    public void hello() {
        System.out.println(LocalDateTime.now());
    }
}
