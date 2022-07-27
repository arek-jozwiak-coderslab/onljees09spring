package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


public class HelloWorld {

    public HelloWorld() {
        System.out.println("hello creating");
    }


    public void hello() {
        System.out.println(LocalDateTime.now());
    }
}
