package com.example.rielodom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sniatDom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sniat_dom);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClick(View view) {
        Intent intent = new Intent(sniatDom.this, sniatVtorich.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(sniatDom.this, homeAndYchastki.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(sniatDom.this, profil.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
        Intent intent = new Intent(sniatDom.this, profil.class);
        startActivity(intent);
    }
}
