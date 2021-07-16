package com.example.elsanabaryelectronics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        User u1 = User.getInstance(33,"Ahmed","Damitta","Ahmed@yahoo.com","01148675915");

    }
    public void LoginBtn (View view){
        Intent intent = new Intent(this,Holder_Activity.class);
        startActivity(intent);
    }
}