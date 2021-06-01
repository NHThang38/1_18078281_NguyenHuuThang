package com.example.a1_18078281_nguyenhuuthang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    Button btnDangNhap;
    EditText userEd;
    EditText passwordEd;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //AnhXa
        btnDangNhap = findViewById(R.id.btnDangNhap);
        userEd = findViewById(R.id.editIUser);
        passwordEd = findViewById(R.id.editPassword);


    }

  
}