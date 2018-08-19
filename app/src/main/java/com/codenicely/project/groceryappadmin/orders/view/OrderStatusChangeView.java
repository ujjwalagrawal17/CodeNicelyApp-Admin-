package com.codenicely.project.groceryappadmin.orders.view;

import com.codenicely.project.groceryappadmin.orders.model.data.ChangeStatusData;
import com.codenicely.project.groceryappadmin.orders.model.data.ChangeTotalData;

public interface OrderStatusChangeView {

    void showDialogLoader(String message, boolean show);

    void onStatusChanged(ChangeStatusData changeStatusData);

    void onTotalChanged(ChangeTotalData changeTotalData);

    void showMessage(String message);
}
