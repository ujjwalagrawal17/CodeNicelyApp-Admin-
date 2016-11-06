package com.example.iket.groceryappadmin.login.presenter;

import android.util.Log;

import com.example.iket.groceryappadmin.login.LoginCallback;
import com.example.iket.groceryappadmin.login.models.LoginProvider;
import com.example.iket.groceryappadmin.login.models.data.LoginData;
import com.example.iket.groceryappadmin.login.view.LoginScreenView;


/**
 * Created by aman on 15/10/16.
 */
public class LoginScreenPresenterImpl implements LoginScreenPresenter {

    private LoginScreenView loginView;
    private LoginProvider loginProvider;

    public LoginScreenPresenterImpl(LoginScreenView loginView, LoginProvider loginProvider) {
        this.loginView = loginView;
        this.loginProvider = loginProvider;
    }

    @Override
    public void requestLogin(String mobile, String password) {

        loginView.showLoading(true);
        Log.d("Resp", "1");
        loginProvider.requestLogin(mobile,password, new LoginCallback() {
            @Override
            public void onSuccess(LoginData loginData) {
                if (loginData.isSuccess()) {
                    loginView.showLoading(false);
                    loginView.onLoginVerified();
                } else {
                    loginView.showLoading(false);
                    loginView.showMessage(loginData.getMessage());
                }

            }

            public void onFailure(String error) {
                loginView.showLoading(false);
                loginView.showMessage("No Internet Connection");

            }
        });


    }
}

