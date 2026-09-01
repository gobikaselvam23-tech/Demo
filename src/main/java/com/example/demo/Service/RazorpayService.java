package com.example.demo.Service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

    @Service
    public class RazorpayService {
        @Value("${razorpay.key.id}")
        private String keyId;

        @Value("${razorpay.key.secret}")
        private String keySecret;

    }
