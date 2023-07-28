package com.example.myapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp0.activity.BaseActivity;
import com.example.myapp0.activity.LoginActivity;
import com.example.myapp0.activity.RegisterActivity;

public class MainActivity extends BaseActivity {

    private Button loginBtn;
    private Button registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateTo(LoginActivity.class);
            }
        });
        registerBtn = findViewById(R.id.btn_register);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateTo(RegisterActivity.class);

            }
        });
    }
}