package com.codenicely.project.groceryappadmin.orders.presenter;

/**
 * Created by iket on 19/10/16.
 */
public interface OrdersPresenter {
    void getOrders(String access_token,String selected_date,int order_type);

}
