package com.example.mytest;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    private TextView tvName, tvMsv, tvLop, tvGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvName = findViewById(R.id.tvName);
        tvMsv = findViewById(R.id.tvMsv);
        tvLop = findViewById(R.id.tvLop);
        tvGender = findViewById(R.id.tvGender);

        // Lấy dữ liệu từ Intent
        String fullname = getIntent().getStringExtra("fullname");
        String msv = getIntent().getStringExtra("msv");
        String lop = getIntent().getStringExtra("lop");
        String gender = getIntent().getStringExtra("gender");

        if (fullname != null) tvName.setText("Họ tên: " + fullname);
        if (msv != null) tvMsv.setText("MSV: " + msv);
        if (lop != null) tvLop.setText("Lớp: " + lop);
        if (gender != null) tvGender.setText("Giới tính: " + gender);
    }
}
