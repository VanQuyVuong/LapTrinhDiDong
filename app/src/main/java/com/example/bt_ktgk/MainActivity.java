package com.example.bt_ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnGo;
    EditText edTen, edMsv, edLop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
         edTen = findViewById(R.id.edTen);
         edLop = findViewById(R.id.edLop);
         edMsv = findViewById(R.id.edMsv);
         btnGo = findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edTen.getText().toString();
                String lop = edLop.getText().toString();
                String msv = edMsv.getText().toString();

                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("ten", ten);
                intent.putExtra("lop", lop);
                intent.putExtra("msv", msv);

                startActivity(intent);
            }
        });


    }
}