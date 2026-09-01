package com.example.demo.Controller;
import com.example.demo.entity.RecoveryAttempt;
import com.example.demo.Service.RecoveryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
    @RestController
    @RequestMapping("/recovery")
    public class RecoveryController {

        private final RecoveryService recoveryService;

        public RecoveryController(RecoveryService recoveryService) {
            this.recoveryService = recoveryService;
        }

        @PostMapping
        public RecoveryAttempt recover(@RequestBody RecoveryAttempt attempt) {
            return recoveryService.recover(attempt);
        }
        @GetMapping
        public List<RecoveryAttempt> getAllRecoveryAttempts() {
            return recoveryService.getAllRecoveryAttempts();
        }
    }

