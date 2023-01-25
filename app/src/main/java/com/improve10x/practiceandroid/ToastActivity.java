package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        getSupportActionBar().setTitle("Toast");
        Toast.makeText(this, "Hello Hareesh", Toast.LENGTH_SHORT).show();
    }
}