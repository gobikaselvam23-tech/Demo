package com.example.demo.Service;
import com.example.demo.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class RiskService {

        public String calculateRisk(Payment payment) {

            if ("FAILED".equalsIgnoreCase(payment.getStatus())) {

                if (payment.getAmount() >= 5000) {
                    return "HIGH";
                } else if (payment.getAmount() >= 2000) {
                    return "MEDIUM";
                } else {
                    return "LOW";
                }
            }

            return "NO_RISK";
        }
    }
