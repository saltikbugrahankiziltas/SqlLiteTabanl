package com.example.sqllitetabanl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtfullname,txtemail,txtpass;
    Button btngiris,btnnumber;
    SQLiteDatabase db;
    String isim="Bugra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtfullname=findViewById(R.id.PersonFullName);
        txtpass=findViewById(R.id.PersonPassword);
        btngiris=findViewById(R.id.btngiris);
        btnnumber=findViewById(R.id.btnnumara);
        try {
            db=this.openOrCreateDatabase("Login",MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS person (ıd INTEGER PRIMARY KEY, fullname VARCHAR, password INTEGER) ");

        }catch (Exception e){
            e.printStackTrace();
        }
        Cursor c=db.rawQuery("SELECT * FROM person",null);
        int IdIndex=c.getColumnIndex("Id");
        int fullnameIndex=c.getColumnIndex("Fullname");
        int passwordIndex=c.getColumnIndex("Password");


        btngiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intt);
            }
        });
        btnnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt2=new Intent(MainActivity.this,MainActivityTel.class);
                startActivity(intt2);
            }
        });
        private void getData() {

            Cursor c = db.rawQuery("SELECT * FROM person", null);
            int IdIndex = c.getColumnIndex("Id");
            int adIndex = c.getColumnIndex("ad");
            int soyadIndex = c.getColumnIndex("soyad");
            while (c.moveToNext()) {
                showtxt.append("Id: " + c.getInt(IdIndex) + " Adı:" + c.getString(adIndex) + " Soyadı:" + c.getString(soyadIndex) + "\n");
            }
            c.close();
        }
    }
}