package com.example.rielodom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class homeAndYchastki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_and_ychastki);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClick(View view) {
        Intent intent = new Intent(homeAndYchastki.this, osnovnoiEkran.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(homeAndYchastki.this, novostroi.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(homeAndYchastki.this, sniatDom.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
        Intent intent = new Intent(homeAndYchastki.this, profil.class);
        startActivity(intent);
    }
}