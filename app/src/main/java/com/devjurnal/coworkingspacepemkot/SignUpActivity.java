package com.devjurnal.coworkingspacepemkot;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtNoKTP,edtUsername,edtPassword,edtEmail,edtNama,edtNoHP;
    Button btnLogin,btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViewOnClick();

    }

    private void initViewOnClick() {
        edtEmail = findViewById(R.id.edtEmail);
        edtNama = findViewById(R.id.edtNama);
        edtNoHP = findViewById(R.id.edtNoHP);
        edtNoKTP = findViewById(R.id.edtNoKTP);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnLogin:
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                break;
            case R.id.btnSignUp:
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                Toast.makeText(this, "Berhasil Sign Up", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
