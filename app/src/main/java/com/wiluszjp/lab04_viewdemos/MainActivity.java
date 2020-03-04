package com.wiluszjp.lab04_viewdemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    // Do NOT use activity_main; Use demo_one, demo_two, etc.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_two); //swap different demos here

    }
}