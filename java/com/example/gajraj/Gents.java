package com.example.gajraj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gents);
    }

    public void btn3(View view) {
        Intent i1=new Intent(getApplicationContext(),Hair.class);
        startActivity(i1);
    }

    public void facial(View view) {
        Intent i1=new Intent(getApplicationContext(),Facial.class);
        startActivity(i1);
    }

    public void beard(View view) {
        Intent i1=new Intent(getApplicationContext(),Beard.class);
        startActivity(i1);
    }

    public void massage(View view) {
        Intent i1=new Intent(getApplicationContext(),massage.class);
        startActivity(i1);
    }
}