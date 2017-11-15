package com.devjurnal.coworkingspacepemkot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListTempatActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tempat);
        img1 = findViewById(R.id.imglist1);
        img2 = findViewById(R.id.imglist2);
        img3 = findViewById(R.id.imglist3);
        img4 = findViewById(R.id.imglist4);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.imglist1:
                startActivity(new Intent(ListTempatActivity.this,FormPeminjamanActivity.class));
                break;
            case R.id.imglist2:
                startActivity(new Intent(ListTempatActivity.this,FormPeminjamanActivity.class));
                break;
            case R.id.imglist3:
                startActivity(new Intent(ListTempatActivity.this,FormPeminjamanActivity.class));
                break;
            case R.id.imglist4:
                startActivity(new Intent(ListTempatActivity.this,FormPeminjamanActivity.class));
                break;
        }

    }
}
