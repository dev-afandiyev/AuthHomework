package com.example.homeworkauth.ui.presenter;

import com.example.homeworkauth.ui.view.IAuthView;

public class AuthPresenter implements IAuthPresenter {
    private IAuthView iAuthView;

    public AuthPresenter(IAuthView iAuthView) {
        this.iAuthView = iAuthView;
    }


    @Override
    public void onLogin(String email, String password) {
<<<<<<< HEAD
=======


>>>>>>> origin/master
    }

}
