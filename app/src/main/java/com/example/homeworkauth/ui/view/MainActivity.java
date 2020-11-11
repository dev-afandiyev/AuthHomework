package com.example.homeworkauth.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.homeworkauth.R;
import com.example.homeworkauth.data.AuthRepo;;
import com.example.homeworkauth.domain.AuthInteractor;
import com.example.homeworkauth.ui.presenter.AuthPresenter;
import com.example.homeworkauth.ui.presenter.IAuthPresenter;

public class MainActivity extends AppCompatActivity implements IAuthView{
    private EditText edt_email, edt_password;
    private Button binSingIn;
    private IAuthPresenter iAuthPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRegister();
        btnListener();
    }

    private void setRegister(){
        binSingIn = (Button) findViewById(R.id.btn_sign_in);
        edt_email = (EditText) findViewById(R.id.et_login);
        edt_password = (EditText) findViewById(R.id.et_password);
        iAuthPresenter = new AuthPresenter(this, new AuthInteractor(new AuthRepo()));
    }

    private void btnListener(){
        binSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iAuthPresenter.onLogin(edt_email.getText().toString(), edt_password.getText().toString());
            }
        });
    }

    @Override
    public void toIntent(Intent intent) {
        Intent intent1 = new Intent(MainActivity.this, UserList.class);
         startActivity(intent1);
    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
    }

}