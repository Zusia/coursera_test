package com.example.art;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.content.ContentValues.*;

public class Register extends SQLiteOpenHelper {
    public static final String Customer ="customer.db";
    public static final String Customers ="customers";
    public static final String CID ="ID";
    public static final String CName ="Name";
    public static final String ContactNumber ="Contact";
    public static final String DeliveryAddress ="Address";
    public static final String CEmail ="Email";

    public Register(Context context) {
        super(context, Customer, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+ Customers + "(CID Integer Primary key autoincrement,CName Text,ContactNumber Integer,DeliveryAddress TEXT, CEmail Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+Customers);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String Name, String Address, String Phone, String Email){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues =new ContentValues();
        ContentValues.put(CName,Name);
        ContentValues.put(ContactNumber, Phone);
        ContentValues.put(DeliveryAddress, Address);
        ContentValues.put(CEmail, Email);

        long result=db.insert(Customers,null, contentValues);
        if (result != -1) {
            return true;
        } else {
            return false;
        }
    }
}
