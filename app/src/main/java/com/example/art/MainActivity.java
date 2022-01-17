package com.example.art;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Register myDB;
    EditText CName,CPhone, CAddress, CEmail;
    Button register;

    Button admin_button,member_button,view_button,contact_button;
    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myDB=new Register(this);

        setContentView(R.layout.activity_main);

        //database detials
        CName=(EditText)findViewById(R.id.name);
        CPhone=(EditText)findViewById(R.id.phone);
        CEmail=(EditText)findViewById(R.id.email);
        CAddress=(EditText)findViewById(R.id.address);
        register=(Button)findViewById(R.id.register);
        AddData();


        //calling respective page upon clicking button
        admin_button =findViewById(R.id.admin_btn);
        admin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Admin.class);
            }
        });

        member_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Member.class);
            }
        });

        view_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Gallery.class);
            }
        });

        contact_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ContactUs.class);
            }
        });
    }

    private void AddData() {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted= myDB.insertData(CName.getText().toString(),CAddress.getText().toString(),CPhone.getText().toString(),CEmail.getText().toString());
            }
        });
    }
}