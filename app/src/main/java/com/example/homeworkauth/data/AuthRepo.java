package com.example.homeworkauth.data;

import com.example.homeworkauth.data.model.AuthModel;

public class AuthRepo implements IAuthRepo {

    @Override
    public AuthModel getAuthModel() {

        AuthModel authModel = new AuthModel();
        return authModel;

    }


}
