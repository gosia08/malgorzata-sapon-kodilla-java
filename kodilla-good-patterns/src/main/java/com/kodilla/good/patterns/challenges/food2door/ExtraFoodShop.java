package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class ExtraFoodShop implements OrderService {
    @Override
    public boolean process(User user, LocalDateTime orderDate, Shop shop) {
        System.out.println("Welcome to Extra Food Shop");
        return true;

    }
}