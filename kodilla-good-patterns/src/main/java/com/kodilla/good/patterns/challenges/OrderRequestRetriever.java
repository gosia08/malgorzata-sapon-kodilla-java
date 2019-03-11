package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Ala", "Dyrcz");

        LocalDateTime orderDate = LocalDateTime.of(2019,3,11,11,00);

        return new OrderRequest (user, orderDate);

    }
}