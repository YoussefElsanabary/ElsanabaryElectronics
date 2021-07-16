package com.example.elsanabaryelectronics;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddToCat extends AppCompatActivity {

    MyDBhelper db = new MyDBhelper(this);
    EditText name ;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cat);

        name = (EditText) findViewById(R.id.editTextTextPersonName2);
        lst = (ListView)findViewById(R.id.list_view500);
    }
    public void DoneBtn (View view){

        Toast.makeText(AddToCat.this , "SAVED",Toast.LENGTH_SHORT).show();}
       /* String input = String.valueOf(name.getText());
        db.insertintocategories(input);
        Boolean result = db.insertintocategories(input);
            if (result == true){
                Toast.makeText(AddToCat.this , "SAVED",Toast.LENGTH_SHORT).show();
                name.setText("");
                ShowData();
            }else {
                Toast.makeText(AddToCat.this , "UNSAVED",Toast.LENGTH_SHORT).show();
            }
    }
    public void ShowData() {
        ArrayList<String> list = db.getAllrecord();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        lst.setAdapter(arrayAdapter);

    }*/
}