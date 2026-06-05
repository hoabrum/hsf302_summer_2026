package com.springboot.repository;

import com.springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("FROM Customer c JOIN c.orders o WHERE c.firstName = :firstName OR c.lastName = :lastName")
    List<Customer> search(String firstName, String lastName);

}
