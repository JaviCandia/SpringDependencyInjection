package com.javiersillo.store;

// This interface defines the contract for any payment provider implementation.
public interface PaymentService {
    void processPayment(double amount);
}
