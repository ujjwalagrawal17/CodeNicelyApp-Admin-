package com.codenicely.project.groceryappadmin.orders.model.data;

public class ChangeTotalData {

    private boolean success;
    private String message;

    public ChangeTotalData(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
