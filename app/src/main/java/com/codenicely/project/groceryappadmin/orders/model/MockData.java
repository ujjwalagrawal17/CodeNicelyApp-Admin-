package com.codenicely.project.groceryappadmin.orders.model;

import com.codenicely.project.groceryappadmin.orders.OnOrdersListReceived;

/**
 * Created by iket on 5/11/16.
 */
public class MockData implements OrdersProvider {

    @Override
    public void getOrders(String access_token, String selected_date, int order_type, OnOrdersListReceived onOrdersListReceived) {

    }
}
