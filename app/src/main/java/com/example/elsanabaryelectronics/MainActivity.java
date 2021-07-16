package com.example.elsanabaryelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   public void EnterBtn (View view){
        Intent intent = new Intent(this,Holder_Activity.class);
        startActivity(intent);
    }
    public void Login_Btn (View view){
        Intent intent = new Intent(this,Login_Activity.class);
        startActivity(intent);
    }
    public void Sign_Up_ (View view){
        Intent intent = new Intent(this,SignUp_Activity.class);
        startActivity(intent);}


}