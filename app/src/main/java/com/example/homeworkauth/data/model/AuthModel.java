package com.example.homeworkauth.data.model;

import android.text.TextUtils;
import android.util.Patterns;

public class AuthModel implements IAuthModel {
    private String email, password;

    public AuthModel() { }

    public AuthModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return email;

    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidData() {
        return !TextUtils.isEmpty(getLogin()) &&
                Patterns.EMAIL_ADDRESS.matcher(getLogin()).matches() &&
                getPassword().length() > 6;
    }

}
