package com.example.demo.Repository;
import com.example.demo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface PaymentRepository extends JpaRepository<Payment, Long> {
    }


