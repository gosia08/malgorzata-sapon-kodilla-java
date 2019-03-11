package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class FlowerOrderRepository implements OrderRepository {
    @Override
    public boolean create(User user, LocalDateTime orderDate) {
        return true;
    }
}