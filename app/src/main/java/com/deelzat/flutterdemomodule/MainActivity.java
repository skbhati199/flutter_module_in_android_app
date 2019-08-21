package com.deelzat.flutterdemomodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import io.flutter.facade.Flutter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        View view = io.flutter.facade.Flutter.createView(this, getLifecycle(),"Home");
        setContentView(view);
    }
}
