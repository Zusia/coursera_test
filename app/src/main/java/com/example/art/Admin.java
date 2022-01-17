package com.example.art;

import android.content.Intent;
import android.graphics.Region;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {
    EditText uname,pword;
    Button login1;
    TextView register1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);
        uname=findViewById(R.id.username);
        pword=findViewById(R.id.password);
        login1=findViewById(R.id.login);
        register1=findViewById(R.id.register);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Admin.this,MainActivity.class);
                startActivity(intent);
            }
        });
        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Admin.this, Register.class);
            }
        });
    }
}
