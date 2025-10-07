package com.example.quyvuong_bt_chuyen_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityProfile extends AppCompatActivity {

    private ImageView ivSettings;
    private TextView tvProfileName, tvEmail;
    private String username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Ánh xạ view
        ivSettings = findViewById(R.id.ivSettings);
        tvProfileName = findViewById(R.id.tvProfileName);
        tvEmail = findViewById(R.id.tvEmail);

        // Nhận dữ liệu từ Login
        Intent intent = getIntent();
        username = intent.getStringExtra("username");
        email = intent.getStringExtra("email");

        // Hiển thị thông tin
        if (username != null) {
            tvProfileName.setText(username);
        }
        if (email != null) {
            tvEmail.setText(email);
        }

        // Bấm icon Settings để quay lại Login
        ivSettings.setOnClickListener(v -> {
            Toast.makeText(ActivityProfile.this, "Đang quay lại Login...", Toast.LENGTH_SHORT).show();
            Intent backIntent = new Intent(ActivityProfile.this, ActivityLogin.class);
            startActivity(backIntent);
            finish();
        });
    }
}
