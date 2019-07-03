package com.tws.refactoring.extract_method;

import java.util.List;
import java.util.Objects;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {

        // print banner
        System.out.println("*****************************");
        System.out.println("****** Customer totals ******");
        System.out.println("*****************************");

        // print owings
        double outstanding = calculateOutstanding(orders);

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private double calculateOutstanding(List<Order> orders) {
        if (Objects.isNull(orders) || orders.size() == 0) {
            return 0.0;
        }

        return orders.stream()
                .mapToDouble(Order::getAmount)
                .sum();
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    double getAmount() {
        return amount;
    }
}
