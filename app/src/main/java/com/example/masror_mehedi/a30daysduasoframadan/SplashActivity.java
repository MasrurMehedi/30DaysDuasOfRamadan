package com.example.masror_mehedi.a30daysduasoframadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private  static  int splashTimeOut=4000;//times in mili second
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        android.support.v7.app.ActionBar actionBar= getSupportActionBar();

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);


    }
}
