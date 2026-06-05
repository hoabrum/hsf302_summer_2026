package com.springboot.config;

import com.springboot.entity.Customer;
import com.springboot.entity.Order;
import com.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer("First Name 1", "Last Name 1", "090XX01", "Address1");
        Customer customer2 = new Customer("First Name 2", "Last Name 2", "090XX02", "Address2");
        Customer customer3 = new Customer("First Name 3", "Last Name 3", "090XX03", "Address3");

        Order order1 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 1, "Order 1");
        order1.setCustomer(customer1);
        Order order2 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 2, "Order 2");
        order2.setCustomer(customer1);
        Order order3 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 3, "Order 3");
        order2.setCustomer(customer1);
        List<Order> ordersGroup1 = Arrays.asList(order1, order2, order3);
        customer1.setOrders(ordersGroup1);

        Order order4 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 4, "Order 4");
        order4.setCustomer(customer2);
        Order order5 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 5, "Order 5");
        order5.setCustomer(customer2);
        Order order6 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 6, "Order 6");
        order6.setCustomer(customer2);
        List<Order> ordersGroup2 = Arrays.asList(order4, order5, order6);
        customer2.setOrders(ordersGroup2);

        Order order7 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 7, "Order 7");
        order7.setCustomer(customer3);
        Order order8 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 8, "Order 8");
        order8.setCustomer(customer3);
        Order order9 = new Order(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(), 9, "Order 9");
        order9.setCustomer(customer3);
        List<Order> ordersGroup3 = Arrays.asList(order7, order8, order9);
        customer3.setOrders(ordersGroup3);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
    }
}
