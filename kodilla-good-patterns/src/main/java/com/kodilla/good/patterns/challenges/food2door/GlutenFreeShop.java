package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class GlutenFreeShop implements OrderService {
    @Override
    public boolean process(User user, LocalDateTime orderDate, Shop shop) {
        System.out.println("Welcome to Gluten Free Shop");
        return true;
    }
}