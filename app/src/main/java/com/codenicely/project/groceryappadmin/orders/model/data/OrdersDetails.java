package com.codenicely.project.groceryappadmin.orders.model.data;

/**
 * Created by ramya on 6/11/16.
 */

public class OrdersDetails {
    private String image;
    private String name;
    private int quantity;
    private int price;
    private int discounted_price;
    private String unit;
    private String size;

    public OrdersDetails(String image, String name, int quantity, int price, int discounted_price, String unit, String size) {
        this.image = image;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discounted_price = discounted_price;
        this.unit = unit;
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getSize() {
        return size;
    }

    public int getDiscounted_price() {
        return discounted_price;
    }

    public int getPrice() {
        return price;
    }
}
