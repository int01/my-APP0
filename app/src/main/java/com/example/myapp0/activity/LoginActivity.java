package com.example.myapp0.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapp0.R;

import okhttp3.OkHttpClient;

public class LoginActivity extends BaseActivity {

    private EditText editAccount;
    private EditText editPwd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editAccount = findViewById(R.id.edit_account);
        editPwd = findViewById(R.id.edit_pwd);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String account = editAccount.getText().toString();
                String pwd = editPwd.getText().toString();
                System.out.println("登录事件");
                login(account.trim(), pwd.trim());
            }
        });
    }

    private void login(String account, String pwd) {
        System.out.println(account.length() + ":" + pwd);
        if (account == null || account.length() < 1) {
            showToast("账号为空");
            return;
        }
        if (pwd == null || pwd.length() < 1) {
            showToast("密码空");
            return;
        }
        OkHttpClient okHttpClient = new OkHttpClient();
    }
}