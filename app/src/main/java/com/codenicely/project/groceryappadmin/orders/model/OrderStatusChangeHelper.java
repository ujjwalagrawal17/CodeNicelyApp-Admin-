package com.codenicely.project.groceryappadmin.orders.model;

import com.codenicely.project.groceryappadmin.orders.OnOrderStatusChanged;
import com.codenicely.project.groceryappadmin.orders.OnOrderTotalChanged;

/**
 * Created by meghal on 9/11/16.
 */

public interface OrderStatusChangeHelper {

    void changeOrderStatus(String access_token, String order_id, boolean cancle, OnOrderStatusChanged onOrderStatusChanged);
    void changeOrderTotal(String access_token, String order_id, String total_new, OnOrderTotalChanged onOrderTotalChanged);

}
