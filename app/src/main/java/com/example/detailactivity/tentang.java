package com.example.detailactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
    }
    public void tentang2(View view) {
        Intent tentang2= new Intent(tentang.this, tentang2.class);
        startActivity(tentang2);
    }
}