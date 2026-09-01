package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

    public class RecoveryAttempt {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String paymentId;
        private String action;
        private Double confidence;
        private String status;
        private Double recoveredAmount;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getPaymentId() {
            return paymentId;
        }

        public void setPaymentId(String paymentId) {
            this.paymentId = paymentId;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Double getConfidence() {
            return confidence;
        }

        public void setConfidence(Double confidence) {
            this.confidence = confidence;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Double getRecoveredAmount() {
            return recoveredAmount;
        }

        public void setRecoveredAmount(Double recoveredAmount) {
            this.recoveredAmount = recoveredAmount;
        }
    }
