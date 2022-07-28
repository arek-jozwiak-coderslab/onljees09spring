package pl.coderslab;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
    public void send() {
        System.out.println("Sending email");
        System.out.println("Sending email");
    }
}
