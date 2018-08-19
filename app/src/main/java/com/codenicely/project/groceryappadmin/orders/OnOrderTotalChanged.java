package com.codenicely.project.groceryappadmin.orders;

import com.codenicely.project.groceryappadmin.orders.model.data.ChangeTotalData;

/**
 * Created by meghal on 9/11/16.
 */

public interface OnOrderTotalChanged {


    void onSuccess(ChangeTotalData changeTotalData);
    void onFailed();
}
