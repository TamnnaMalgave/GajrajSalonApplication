package com.example.gajraj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Appointment extends AppCompatActivity {
    String rate;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        t1=findViewById(R.id.t1);
        Intent i2=getIntent();
        String rate=i2.getStringExtra("rate");
        t1.setText(""+rate+"Rs.");

    }
}