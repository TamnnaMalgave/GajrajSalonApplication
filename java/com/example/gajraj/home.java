package com.example.gajraj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class home extends AppCompatActivity {
    ViewFlipper f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    getSupportActionBar().hide();
            f1=findViewById(R.id.v1);
            int imgArray[]={R.drawable.salon1,R.drawable.salon4,R.drawable.salon4,R.drawable.salon5};
            for(int i=0;i<imgArray.length;i++)
            {
                showImage(imgArray[i]);
            }

        }

        private void showImage(int img) {
            ImageView imageView=new ImageView(this);
            imageView.setImageResource(img);

            f1.addView(imageView);
            f1.setFlipInterval(2000);
            f1.setAutoStart(true);

            f1.setInAnimation(this,android.R.anim.slide_in_left);
            f1.setOutAnimation(this,android.R.anim.slide_out_right);
        }
    public void products(View view) {
        Intent i1=new Intent(getApplicationContext(),products.class);
        startActivity(i1);
    }
    public void services(View view) {
        Intent i1=new Intent(getApplicationContext(),services.class);
        startActivity(i1);
    }
    public void Appointment(View view) {
        Intent i1=new Intent(getApplicationContext(),Appointment.class);
        startActivity(i1);
    }
    }
