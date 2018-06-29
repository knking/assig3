package com.royraj020498gmail.myfirstapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast knr=Toast.makeText(  MainActivity.this,  " IN CREATE AREA", Toast.LENGTH_LONG);
        knr.setGravity(Gravity.CENTER,0,0);
        knr.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast knr= Toast.makeText(  MainActivity.this,  " IN START AREA", Toast.LENGTH_LONG);
        knr.setGravity(Gravity.TOP,0,0);
        knr.show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(  MainActivity.this,  "IN PAUSE AREA", Toast.LENGTH_LONG) .show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(  MainActivity.this,  " IN RESUME AREA", Toast.LENGTH_LONG) .show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(  MainActivity.this,  " IN STOP AREA", Toast.LENGTH_LONG) .show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(  MainActivity.this,  " IN RESTART AREA", Toast.LENGTH_LONG) .show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(  MainActivity.this,  "IN DESTROY AREA", Toast.LENGTH_LONG) .show();
    }






}
