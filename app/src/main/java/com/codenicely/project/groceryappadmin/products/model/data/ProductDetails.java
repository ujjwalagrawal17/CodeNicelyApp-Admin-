package com.codenicely.project.groceryappadmin.products.model.data;

/**
 * Created by iket on 19/10/16.
 */
public class ProductDetails {
    private String name, image,quantity,price;


    public ProductDetails(String name, String image, String quantity, String price) {
        this.name = name;
        this.image = image;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }
}
