package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    private static final double DISCOUNT_RATE = 0.05;
    private static final int DISCOUNT_START = 500;
    private static final double LOWEST_COST = 100.0;
    private static final double SHIPPING_PRICE = 0.1;

    double getPrice(int quantity, int itemPrice) {
        int basePrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - DISCOUNT_START) * itemPrice * DISCOUNT_RATE;
        double shippingCost = Math.min(quantity * itemPrice * SHIPPING_PRICE, LOWEST_COST);

        return basePrice - discount + shippingCost;
    }
}
