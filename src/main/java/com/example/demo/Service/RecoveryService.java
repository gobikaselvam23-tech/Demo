package com.example.demo.Service;

import com.example.demo.entity.RecoveryAttempt;
import com.example.demo.Repository.RecoveryAttemptRepository;
import org.springframework.stereotype.Service;
import java.util.List;
    @Service
    public class RecoveryService {

        private final RecoveryAttemptRepository repository;

        public RecoveryService(RecoveryAttemptRepository repository) {
            this.repository = repository;
        }

        public RecoveryAttempt recover(RecoveryAttempt attempt) {

            // Recovery action
            attempt.setStatus("SUCCESS");

            // Example: recovered amount
            if (attempt.getRecoveredAmount() == null) {
                attempt.setRecoveredAmount(0.0);
            }

            return repository.save(attempt);
        }

    public List<RecoveryAttempt> getAllRecoveryAttempts() {
        return repository.findAll();
    }

}

