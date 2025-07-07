package com.example.gajraj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profile extends AppCompatActivity {
    FirebaseUser user;
    FirebaseAuth mAuth;
    TextView t1,mail1;
    String usermail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        t1=findViewById(R.id.t1);
        mail1=findViewById(R.id.mail);

        user=FirebaseAuth.getInstance().getCurrentUser();
        usermail = user.getEmail().toString();
        mail1.setText(usermail);


    }
    public void signout(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent i1=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i1);
        finish();
    }
    public void cp(View view) {

        mAuth.sendPasswordResetEmail(usermail).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information

                    Toast.makeText(profile.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),profile.class);
                    startActivity(i);


                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(profile.this, "Authentication failed.", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}