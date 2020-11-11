package com.example.homeworkauth.domain;

import com.example.homeworkauth.data.AuthRepo;
import com.example.homeworkauth.data.model.AuthModel;

public class AuthInteractor implements IAuthInteractor {
    private AuthRepo authRepo;

    public AuthInteractor(AuthRepo authRepo) {
        this.authRepo = authRepo;
    }

    @Override
    public boolean whatIf(AuthModel authModel) {
        return authModel.isValidData();
    }

}
