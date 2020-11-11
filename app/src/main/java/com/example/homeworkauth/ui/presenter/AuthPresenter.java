package com.example.homeworkauth.ui.presenter;

import android.content.Intent;
import com.example.homeworkauth.data.model.AuthModel;
import com.example.homeworkauth.domain.IAuthInteractor;
import com.example.homeworkauth.ui.view.IAuthView;

public class AuthPresenter implements IAuthPresenter {
    private IAuthView iAuthView;
    private IAuthInteractor interactor;

    public AuthPresenter(IAuthView iAuthView, IAuthInteractor interactor) {
        this.iAuthView = iAuthView;
        this.interactor = interactor;
    }

    @Override
    public void onLogin(String email, String password) {
        boolean isLoginSuccess = interactor.whatIf(new AuthModel(email, password));
        if (isLoginSuccess)
            iAuthView.toIntent(new Intent());
        if(isLoginSuccess)
            iAuthView.onLoginResult("Login Success");
        else
            iAuthView.onLoginResult("Login Error");
    }

}

//    AuthModel authModel = new AuthModel(email, password);
//        boolean isLoginSuccess = authModel.isValidData();
