package io.github.marksouzza.customers.model.repository;

import io.github.marksouzza.customers.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
