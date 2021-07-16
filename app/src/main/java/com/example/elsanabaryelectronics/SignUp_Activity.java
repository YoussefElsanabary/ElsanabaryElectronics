package com.example.elsanabaryelectronics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);
    }
    public void Sign_Up (View view){
        Intent intent = new Intent(this,Login_Activity.class);
        startActivity(intent);
    }
}