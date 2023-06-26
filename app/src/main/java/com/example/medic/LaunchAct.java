 package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

 public class LaunchAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent onBoard = new Intent(LaunchAct.this, OnBoardActivity.class);
                startActivity(onBoard);
                finish();
            }
        }, 3000);
    }
}