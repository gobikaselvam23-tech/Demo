package com.example.demo.Controller;
import com.example.demo.entity.RecoveryAttempt;
import com.example.demo.Repository.RecoveryAttemptRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/recovery-attempts")
        public class RecoveryAttemptController {
        private final RecoveryAttemptRepository repository;

        public RecoveryAttemptController(RecoveryAttemptRepository repository) {

            this.repository = repository;
        }

        @PostMapping
        public RecoveryAttempt create(@RequestBody RecoveryAttempt recoveryAttempt) {
            return repository.save(recoveryAttempt);
        }

        @GetMapping
        public List<RecoveryAttempt> getAll() {
            return repository.findAll();
        }
    }
