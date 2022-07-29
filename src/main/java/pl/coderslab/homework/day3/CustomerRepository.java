package pl.coderslab.homework.day3;

import java.util.List;

public interface CustomerRepository {
    void add(Customer customer);

    List<Customer> findAll();

    void remove(Customer customer);
}
