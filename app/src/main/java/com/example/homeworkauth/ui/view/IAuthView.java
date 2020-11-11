package com.example.homeworkauth.ui.view;

import android.content.Intent;

public interface IAuthView {

    void toIntent(Intent intent);

    void onLoginResult(String message);

}
