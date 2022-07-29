package pl.coderslab.homework.day3;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log() {
        System.out.println(LocalDateTime.now().toString() + " : Customer operation");
    }
}
