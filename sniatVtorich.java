package com.example.rielodom;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sniatVtorich extends AppCompatActivity {
    boolean a= false;
    boolean b= false;
    boolean c= false;
    boolean d= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sniat_vtorich);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClick(View view) {
        Intent intent = new Intent(sniatVtorich.this, sniatDom.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(sniatVtorich.this, osnovnoiEkran.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(sniatVtorich.this, profil.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
        Button button1 = findViewById(R.id.одноком);
        if (a) {
            button1.setTextColor(Color.RED);
        } else {
            button1.setTextColor(Color.BLACK);
        }
        a = !a;
    }
    public void onClick4(View view) {
        Button button1 = findViewById(R.id.двеком);
        if (b) {
            button1.setTextColor(Color.RED);
        } else {
            button1.setTextColor(Color.BLACK);
        }
        b = !b;
    }
    public void onClick5(View view) {
        Button button1 = findViewById(R.id.триком);
        if (c) {
            button1.setTextColor(Color.RED);
        } else {
            button1.setTextColor(Color.BLACK);
        }
        c = !c;
    }
    public void onClick6(View view) {
        Button button1 = findViewById(R.id.четибольшеком);
        if (d) {
            button1.setTextColor(Color.RED);
        } else {
            button1.setTextColor(Color.BLACK);
        }
        d = !d;
    }
}