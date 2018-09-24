package com.thoughtworks.repository;

import java.util.List;
import com.thoughtworks.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

}
