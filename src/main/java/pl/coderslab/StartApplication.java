package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;


public class StartApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        helloWorld.hello();

    }
}
