package com.example.mytest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Màn Đăng nhập.
 * Lưu ý: demo dùng SharedPreferences (plain-text) — chỉ demo.
 */
public class DangNhapActivity extends AppCompatActivity {

    private EditText edtTenDangNhap, edtMatKhau;
    private Button btnDangNhap, btnChuyenDangKy;
    private static final String PREFS_NAME = "USER_PREFS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtMatKhau = findViewById(R.id.edtMatKhau);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnChuyenDangKy = findViewById(R.id.btnChuyenDangKy);

        btnChuyenDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhapActivity.this, DangKyActivity.class);
                startActivity(intent);
            }
        });

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyDangNhap();
            }
        });
    }

    private void xuLyDangNhap() {
        String email = edtTenDangNhap.getText().toString().trim();
        String pass = edtMatKhau.getText().toString();

        if (email.isEmpty()) {
            edtTenDangNhap.setError("Vui lòng nhập email");
            edtTenDangNhap.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtTenDangNhap.setError("Email không hợp lệ");
            edtTenDangNhap.requestFocus();
            return;
        }
        if (pass.isEmpty()) {
            edtMatKhau.setError("Vui lòng nhập mật khẩu");
            edtMatKhau.requestFocus();
            return;
        }

        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        String savedEmail = prefs.getString("email", null);
        String savedPass = prefs.getString("pass", null);

        if (savedEmail == null) {
            Toast.makeText(this, "Chưa có tài khoản. Vui lòng đăng ký.", Toast.LENGTH_LONG).show();
            return;
        }

        if (email.equals(savedEmail) && pass.equals(savedPass)) {
            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
            // TODO: nếu muốn chuyển đến trang chủ, tạo TrangChuActivity và startActivity tại đây.
        } else {
            Toast.makeText(this, "Email hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
        }
    }
}
