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


    private final String DEFAULT_NAME = "Van Quy Vuong";
    private final String DEFAULT_MSV = "2311505312250";
    private final String DEFAULT_CLASS = "125LTTDTDD03";
    private final String DEFAULT_GENDER = "16/05/2005";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        gridMenu = findViewById(R.id.gridMenu);
        listMenu = findViewById(R.id.listMenu);
        btnToggle = findViewById(R.id.btnToggle);

        if (gridMenu == null || listMenu == null || btnToggle == null) {
            throw new RuntimeException("⚠️ Layout chưa khớp với ID trong TrangChuActivity!");
        }

        gridMenu.setVisibility(View.VISIBLE);
        listMenu.setVisibility(View.GONE);

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


        int[] cardIds = {R.id.card0, R.id.card1, R.id.card2, R.id.card3};
        int[] listIds = {R.id.listItem0, R.id.listItem1, R.id.listItem2, R.id.listItem3};

        for (int id : cardIds) {
            findViewById(id).setOnClickListener(v -> openDetails());
        }
        for (int id : listIds) {
            findViewById(id).setOnClickListener(v -> openDetails());
        }
    }

    private void openDetails() {
        SharedPreferences prefs = getSharedPreferences("USER_PREFS", MODE_PRIVATE);
        String savedFullname = prefs.getString("fullname", null);
        String name = (savedFullname != null && !savedFullname.isEmpty()) ? savedFullname : DEFAULT_NAME;

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("fullname", name);
        intent.putExtra("msv", DEFAULT_MSV);
        intent.putExtra("lop", DEFAULT_CLASS);
        intent.putExtra("namsinh", DEFAULT_GENDER);
        startActivity(intent);
    }
}
