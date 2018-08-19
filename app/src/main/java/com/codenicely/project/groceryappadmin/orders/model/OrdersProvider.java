package com.codenicely.project.groceryappadmin.orders.model;


import com.codenicely.project.groceryappadmin.orders.OnOrdersListReceived;


public interface OrdersProvider {
    void getOrders(String access_token, String selected_date,int order_type, OnOrdersListReceived onOrdersListReceived);

}
