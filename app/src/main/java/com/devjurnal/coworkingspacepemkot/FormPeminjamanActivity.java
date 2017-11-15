package com.devjurnal.coworkingspacepemkot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormPeminjamanActivity extends AppCompatActivity implements View.OnClickListener{
Button btnPinjam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_peminjaman);
        btnPinjam = findViewById(R.id.btnPinjam);
        btnPinjam.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnPinjam:
                startActivity(new Intent(FormPeminjamanActivity.this, DetailPeminjamanActivity.class));
                break;
        }
    }
}
