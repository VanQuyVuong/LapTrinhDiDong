package com.example.bt_ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    TextView tvHienThi;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent inten = getIntent();
        String ten= getIntent().getStringExtra("ten");
        String lop = getIntent().getStringExtra("lop");
        String msv = getIntent().getStringExtra("msv");
         tvHienThi.setText("Ten :"+ ten + "\nLop :"+lop+"Msv :"+msv);

         btnBack.setOnClickListener(v -> finish());
    }

}