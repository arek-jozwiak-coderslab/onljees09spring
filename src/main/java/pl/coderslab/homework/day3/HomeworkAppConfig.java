package pl.coderslab.homework.day3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HomeworkAppConfig {

    @Bean
    public CustomerLogger customerLogger(){
        return new FileCustomerLogger("log.txt");
    }
}
