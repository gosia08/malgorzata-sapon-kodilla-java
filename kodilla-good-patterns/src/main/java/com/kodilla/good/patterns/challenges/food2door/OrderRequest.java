package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderDate;
    private Shop shop;

    public OrderRequest(final User user, final LocalDateTime orderDate, final Shop shop) {
        this.user = user;
        this.orderDate = orderDate;
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Shop getShop() {
        return shop;
    }
}