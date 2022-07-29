package pl.coderslab.homework.day3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryCustomerRepository implements CustomerRepository {

    private final CustomerLogger logger;

    private List<Customer> customers;

    public MemoryCustomerRepository(CustomerLogger logger) {
        this.logger = logger;
        customers = new ArrayList<>();
    }

    @Override
    public void add(Customer customer) {
        logger.log();
        customers.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        logger.log();
        return this.customers;
    }
    @Override
    public void remove(Customer customer){
        logger.log();
        this.customers.remove(customer);
    }
}
