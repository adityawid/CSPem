package com.devjurnal.coworkingspacepemkot;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PinjamActivity extends AppCompatActivity implements View.OnClickListener{

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;

    private EditText edtTgl,edtKuota;
    private Button btnCari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam);
        // inisialisasi
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        initViewOnClick();

    }

    private void initViewOnClick() {
        edtTgl = findViewById(R.id.edtTgl);
        edtKuota = findViewById(R.id.edtKuota);
        btnCari = findViewById(R.id.btnCari);

        btnCari.setOnClickListener(this);
        edtTgl.setOnClickListener(this);
    }

    // TODO showDatePicker
    private void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                edtTgl.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.edtTgl:
                showDateDialog();
                break;
            case R.id.btnCari:
                startActivity(new Intent(PinjamActivity.this, ListTempatActivity.class));
                break;
        }
    }
}
