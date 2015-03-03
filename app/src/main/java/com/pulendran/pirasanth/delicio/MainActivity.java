package com.pulendran.pirasanth.delicio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.annotation.NonNull;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("pelle","test");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("pelle", "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("pelle", "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("pelle", "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("pelle", "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("pelle", "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("pelle", "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("pelle", "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("pelle", "onRestoreInstanceState");
    }

    @Override
    public void onClick(View v) {
        Log.d("pelle","klikk");

    }
}
