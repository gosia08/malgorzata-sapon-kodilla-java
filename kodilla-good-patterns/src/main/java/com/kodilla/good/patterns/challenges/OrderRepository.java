package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean create (User user, LocalDateTime orderDate);
}