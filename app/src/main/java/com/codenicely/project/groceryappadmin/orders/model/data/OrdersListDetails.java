package com.codenicely.project.groceryappadmin.orders.model.data;

/**
 * Created by ramya on 6/11/16.
 */

public class OrdersListDetails {
    private String order_id;
    private int status_id;
    private String status;
    private String status_next;
    private String mobile;
    private String name;
    private String house_no;
    private String city;
    private String restaurant;
    private String locality;
    private String delivery_slot;
    private String total_without_discount;
    private String total_discount;
    private String total_discounted;
    private String total_gst;
    private String delivery_charges;
    private String total_bill;
    private String created_time;


    public OrdersListDetails(String order_id, int status_id, String status, String status_next, String mobile, String name, String house_no, String city, String restaurant, String locality, String delivery_slot, String total_without_discount, String total_discount, String total_discounted, String total_gst, String delivery_charges, String total_bill, String created_time) {
        this.order_id = order_id;
        this.status_id = status_id;
        this.status = status;
        this.status_next = status_next;
        this.mobile = mobile;
        this.name = name;
        this.house_no = house_no;
        this.city = city;
        this.restaurant = restaurant;
        this.locality = locality;
        this.delivery_slot = delivery_slot;
        this.total_without_discount = total_without_discount;
        this.total_discount = total_discount;
        this.total_discounted = total_discounted;
        this.total_gst = total_gst;
        this.delivery_charges = delivery_charges;
        this.total_bill = total_bill;
        this.created_time = created_time;
    }

    public String getOrder_id() {
        return order_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public String getStatus() {
        return status;
    }

    public String getStatus_next() {
        return status_next;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public String getHouse_no() {
        return house_no;
    }

    public String getCity() {
        return city;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getLocality() {
        return locality;
    }

    public String getDelivery_slot() {
        return delivery_slot;
    }

    public String getTotal_without_discount() {
        return total_without_discount;
    }

    public String getTotal_discount() {
        return total_discount;
    }

    public String getTotal_discounted() {
        return total_discounted;
    }

    public String getTotal_gst() {
        return total_gst;
    }

    public String getDelivery_charges() {
        return delivery_charges;
    }

    public String getTotal_bill() {
        return total_bill;
    }

    public String getCreated_time() {
        return created_time;
    }
}
