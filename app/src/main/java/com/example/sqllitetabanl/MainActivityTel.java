package com.example.sqllitetabanl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTel extends AppCompatActivity {

    EditText number;
    Button btngiriss,btnanaekran;

    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintel);
        btngiriss=findViewById(R.id.btngiris2);
        btnanaekran=findViewById(R.id.btnanaekran);
        number=findViewById(R.id.number);

        btngiriss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(MainActivityTel.this,MainActivity2.class);
                startActivity(int1);
            }
        });
        btnanaekran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(MainActivityTel.this,MainActivity.class);
                startActivity(int2);
            }
        });
    }
}
