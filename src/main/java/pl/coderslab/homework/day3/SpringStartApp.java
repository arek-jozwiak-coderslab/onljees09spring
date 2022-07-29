package pl.coderslab.homework.day3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.AppConfig;

public class SpringStartApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HomeworkAppConfig.class);

        CustomerLogger bean = context.getBean(CustomerLogger.class);
        bean.log();

        CustomerRepository repository = context.getBean(CustomerRepository.class);

        Customer customer = new Customer(1l, "arek", "jozwiak");
        repository.add(customer);

        repository.findAll().forEach(c-> System.out.println(c));
        repository.remove(customer);

    }
}
