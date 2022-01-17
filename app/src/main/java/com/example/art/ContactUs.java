package com.example.art;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.TypefaceCompatApi26Impl;

public class ContactUs extends AppCompatActivity {

    TextView T1, T2, T3, T4;
    ImageView map;
    Button b1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_layout);

        T1=findViewById(R.id.myName);
        T2 =findViewById(R.id.myAddress);
        T3=findViewById(R.id.myPhone);
        T4=findViewById(R.id.myEmail);
    }
}
