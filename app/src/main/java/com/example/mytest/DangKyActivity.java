package com.example.mytest;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Màn Đăng ký: yêu cầu email, sđt, họ tên, mật khẩu, xác nhận mật khẩu.
 * Lưu vào SharedPreferences demo.
 */
public class DangKyActivity extends AppCompatActivity {

    private EditText edtHoTen, edtEmail, edtSoDienThoai, edtMatKhauReg, edtXacNhanMatKhau;
    private Button btnDangKy;
    private static final String PREFS_NAME = "USER_PREFS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        edtHoTen = findViewById(R.id.edtHoTen);
        edtEmail = findViewById(R.id.edtEmail);
        edtSoDienThoai = findViewById(R.id.edtSoDienThoai);
        edtMatKhauReg = findViewById(R.id.edtMatKhauReg);
        edtXacNhanMatKhau = findViewById(R.id.edtXacNhanMatKhau);
        btnDangKy = findViewById(R.id.btnDangKy);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyDangKy();
            }
        });
    }

    private void xuLyDangKy() {
        String hoTen = edtHoTen.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String sdt = edtSoDienThoai.getText().toString().trim();
        String pass = edtMatKhauReg.getText().toString();
        String confirm = edtXacNhanMatKhau.getText().toString();

        if (hoTen.isEmpty()) {
            edtHoTen.setError("Nhập họ tên");
            edtHoTen.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            edtEmail.setError("Nhập email");
            edtEmail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtEmail.setError("Email không hợp lệ");
            edtEmail.requestFocus();
            return;
        }
        if (sdt.isEmpty()) {
            edtSoDienThoai.setError("Nhập số điện thoại");
            edtSoDienThoai.requestFocus();
            return;
        }
        if (pass.isEmpty()) {
            edtMatKhauReg.setError("Nhập mật khẩu");
            edtMatKhauReg.requestFocus();
            return;
        }
        if (!pass.equals(confirm)) {
            edtXacNhanMatKhau.setError("Mật khẩu không khớp");
            edtXacNhanMatKhau.requestFocus();
            return;
        }

        // Lưu thông tin (demo) - KHÔNG DÙNG CHO PRODUCTION
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("fullname", hoTen);
        editor.putString("email", email);
        editor.putString("phone", sdt);
        editor.putString("pass", pass);
        editor.apply();

        Toast.makeText(this, "Đăng ký thành công! Vui lòng đăng nhập.", Toast.LENGTH_LONG).show();
        finish(); // quay về màn đăng nhập
    }
}
