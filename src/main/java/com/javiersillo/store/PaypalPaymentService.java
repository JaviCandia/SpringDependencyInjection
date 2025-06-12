package com.javiersillo.store;

import org.springframework.stereotype.Service;
// Concrete implementation of PaymentService for handling payments with PayPal
// Declares this class as a Spring Bean so it can be auto-injected wherever PaymentService is required
@Service
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
