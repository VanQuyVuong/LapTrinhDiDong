package com.example.mytest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TrangChuActivity extends AppCompatActivity {

    private GridLayout gridMenu;
    private LinearLayout listMenu;
    private Button btnToggle;

    // Thông tin mặc định (theo bạn cung cấp)
    private final String DEFAULT_NAME = "Van Quy Vuong";
    private final String DEFAULT_MSV = "2311505312250";
    private final String DEFAULT_CLASS = "125LTTDTDD03";
    private final String DEFAULT_GENDER = "NAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        gridMenu = findViewById(R.id.gridMenu);
        listMenu = findViewById(R.id.listMenu);
        btnToggle = findViewById(R.id.btnToggle);

        // Mặc định hiển thị Grid, ẩn List
        gridMenu.setVisibility(View.VISIBLE);
        listMenu.setVisibility(View.GONE);

        // Toggle giữa Grid và List
        btnToggle.setOnClickListener(v -> {
            if (gridMenu.getVisibility() == View.VISIBLE) {
                gridMenu.setVisibility(View.GONE);
                listMenu.setVisibility(View.VISIBLE);
                btnToggle.setText("Chuyển sang lưới");
            } else {
                gridMenu.setVisibility(View.VISIBLE);
                listMenu.setVisibility(View.GONE);
                btnToggle.setText("Chuyển sang danh sách");
            }
        });

        // Gán click cho 4 ô trong Grid (ids: card0..card3)
        findViewById(R.id.card0).setOnClickListener(v -> openDetails());
        findViewById(R.id.card1).setOnClickListener(v -> openDetails());
        findViewById(R.id.card2).setOnClickListener(v -> openDetails());
        findViewById(R.id.card3).setOnClickListener(v -> openDetails());

        // Gán click cho 4 ô trong List (ids: listItem0..listItem3)
        findViewById(R.id.listItem0).setOnClickListener(v -> openDetails());
        findViewById(R.id.listItem1).setOnClickListener(v -> openDetails());
        findViewById(R.id.listItem2).setOnClickListener(v -> openDetails());
        findViewById(R.id.listItem3).setOnClickListener(v -> openDetails());
    }

    // Mở màn chi tiết, truyền thông tin (nếu có fullname lưu trong SharedPreferences -> ưu tiên lấy)
    private void openDetails() {
        // Lấy fullname lưu khi đăng ký (nếu có)
        SharedPreferences prefs = getSharedPreferences("USER_PREFS", MODE_PRIVATE);
        String savedFullname = prefs.getString("fullname", null);
        String name = (savedFullname != null && !savedFullname.isEmpty()) ? savedFullname : DEFAULT_NAME;

        Intent intent = new Intent(TrangChuActivity.this, DetailsActivity.class);
        intent.putExtra("fullname", name);
        intent.putExtra("msv", DEFAULT_MSV);
        intent.putExtra("lop", DEFAULT_CLASS);
        intent.putExtra("gender", DEFAULT_GENDER);
        startActivity(intent);
    }
}
