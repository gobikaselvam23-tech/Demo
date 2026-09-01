
    package com.example.demo.ai;

import org.springframework.stereotype.Service;

    @Service
    public class AIService {

        public String getRecommendation(String riskLevel) {

            if ("HIGH".equalsIgnoreCase(riskLevel)) {
                return "Send urgent payment recovery message";
            } else if ("MEDIUM".equalsIgnoreCase(riskLevel)) {
                return "Send payment retry reminder";
            } else if ("LOW".equalsIgnoreCase(riskLevel)) {
                return "Send normal payment reminder";
            } else {
                return "No action required";
            }
        }
    }

