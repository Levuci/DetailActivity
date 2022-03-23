package com.example.detailactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tentang2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang2);
    }
    public void tentang3 (View view) {
        Intent tentang3 = new Intent(tentang2.this, tentang3.class);
        startActivity(tentang3);
    }
}