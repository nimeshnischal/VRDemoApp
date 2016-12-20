package com.example.nmz.vrdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToVRPhoto(View view)
    {
        Intent intent = new Intent(this, SimpleVrPanoramaActivity.class);
        startActivity(intent);
    }
    public void goToVRVideo(View view)
    {
        Intent intent = new Intent(this, SimpleVrVideoActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {

        android.os.Process.killProcess(android.os.Process.myPid());
        // This above line close correctly
    }
}
