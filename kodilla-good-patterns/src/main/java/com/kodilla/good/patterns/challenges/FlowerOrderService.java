package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class FlowerOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDateTime orderDate) {
        return true;
    }
}