package com.example.demo.Controller;

import com.example.demo.entity.Payment;
import com.example.demo.Repository.PaymentRepository;
import com.example.demo.Service.RiskService;
import com.example.demo.ai.AIService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin(origins ="http://localhost:5173")
@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentRepository paymentRepository;
    private final RiskService riskService;
    private final AIService aiService;

    public PaymentController(PaymentRepository paymentRepository,
                             RiskService riskService,
                             AIService aiService) {

        this.paymentRepository = paymentRepository;
        this.riskService = riskService;
        this.aiService = aiService;
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {

        // Step 1: Calculate Risk
        String risk = riskService.calculateRisk(payment);
        payment.setRiskLevel(risk);

        // Step 2: Get AI Recommendation
        String recommendation = aiService.getRecommendation(risk);

        payment.setRecommendation(recommendation);


        System.out.println("AI Recommendation: " + recommendation);

        // Step 3: Save Payment
        return paymentRepository.save(payment);
    }

    @GetMapping("/test")
    public String test() {
        return "Payment Controller Working";
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentRepository.findById(id).orElse(null);
    }
}