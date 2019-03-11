package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski");
        Shop shop = new Shop("ExtraFoodShopOrderService",3, "Green Tea");

        LocalDateTime orderDate = LocalDateTime.of(2018,5,20,14,25);

        return new OrderRequest (user, orderDate, shop);

    }
}