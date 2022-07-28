package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.coderslab.beans.*;

@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

//    @Bean
//    public HelloWorld helloWorld(){
//        return  new HelloWorld();
//    }

//    @Bean
//    public Captain jackSparrow() {
//        return new Captain();
//    }
//
//    @Bean
//    public Ship blackPearl() {
//        return new Ship(jackSparrow());
//    }

    @Bean
    public ScopeSingleton scopeSingleton(){
        return new ScopeSingleton();
    }

    @Bean
    @Scope("prototype")
    public ScopePrototype scopePrototype(){
        return new ScopePrototype();
    }
}
