package com.javiersillo.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(StoreApplication.class, args);

        // Using constructor to inject the service || Common way
        // OrderService orderService = new OrderService(new PaypalPaymentService());

        // Using setter to inject the service || it's not common
        // orderService.setPaymentService(new StripePaymentService());

        // Retrieve the OrderService bean managed by Spring (it will use PaypalPaymentService because it's annotated with @Service)
        OrderService orderService = appContext.getBean(OrderService.class);

        orderService.placeOrder();
    }
}
