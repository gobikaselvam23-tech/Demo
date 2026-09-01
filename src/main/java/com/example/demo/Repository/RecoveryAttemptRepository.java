package com.example.demo.Repository;

import com.example.demo.entity.RecoveryAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecoveryAttemptRepository extends JpaRepository<RecoveryAttempt, Long> {
}