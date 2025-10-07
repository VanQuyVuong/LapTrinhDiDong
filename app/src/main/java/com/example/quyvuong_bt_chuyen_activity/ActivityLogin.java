package com.example.quyvuong_bt_chuyen_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(ActivityLogin.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            } else {
                // Dữ liệu mẫu để truyền qua Profile
                String email = "23115053122250@ute.udn.vn";
                String phone = "0763794166";
                String skype = "quyvuong250";

                Intent intent = new Intent(ActivityLogin.this, ActivityProfile.class);
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("skype", skype);
                startActivity(intent);
                // KHÔNG finish() để quay lại được
            }
        });
    }
}
