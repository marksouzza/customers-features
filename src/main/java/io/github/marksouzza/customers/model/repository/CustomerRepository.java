package io.github.marksouzza.customers.model.repository;

import io.github.marksouzza.customers.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
