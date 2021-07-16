package com.example.elsanabaryelectronics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MyDBhelper extends SQLiteOpenHelper {

    private static final String dbName = "Application";
    private static final int dbversion = 1;
    public MyDBhelper(@Nullable Context context) {
        super(context, dbName, null, dbversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDBStructure(db , 0 , dbversion);
    }


    public boolean insertintocategories( String name ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        long result = db.insert("CATEGORIES",null,contentValues);
        if (result == -1)
            return false ;
        else
            return true;
    }

    public ArrayList getAllrecord () {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery("select name from CATEGORIES", null);
      //  res.moveToFirst();
      //  while (res.isAfterLast() == false) {
        //    String t1 = res.getString(0);
         //   String t2 = res.getString(1);
          //  String t3 = res.getString(2);


           // arrayList.add(t1 + "- "+t2+" "+t3);
           // res.moveToNext();
       // }
        return arrayList;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        updateMyDBStructure(db ,i , i1);
    }


    public void updateMyDBStructure(SQLiteDatabase db, int i, int i1) {
        if (i < 1){
            db.execSQL("CREATE TABLE CATEGORIES("+
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT);");

            insertintocategories( "name" );
        }
    }

}
