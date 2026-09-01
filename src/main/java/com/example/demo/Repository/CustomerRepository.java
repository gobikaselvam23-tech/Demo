package com.example.demo.Repository;
import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository {

    public interface customerRepository extends JpaRepository<Customer, Long> {
    }
}
