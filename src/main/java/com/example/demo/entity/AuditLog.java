package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuditLog {
    @Id
        private Long id;
        private String paymentId;
        private String detectedReason;
        private String aiDecision;
        private Double confidence;
        private String action;
        private String result;
        private Double amountRecovered;

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

        public String getDetectedReason() {
            return detectedReason;
        }

        public void setDetectedReason(String detectedReason) {
            this.detectedReason = detectedReason;
        }

        public String getAiDecision() {
            return aiDecision;
        }

        public void setAiDecision(String aiDecision) {
            this.aiDecision = aiDecision;
        }

        public Double getConfidence() {
            return confidence;
        }

        public void setConfidence(Double confidence) {
            this.confidence = confidence;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public Double getAmountRecovered() {
            return amountRecovered;
        }

        public void setAmountRecovered(Double amountRecovered) {
            this.amountRecovered = amountRecovered;
        }
    }

