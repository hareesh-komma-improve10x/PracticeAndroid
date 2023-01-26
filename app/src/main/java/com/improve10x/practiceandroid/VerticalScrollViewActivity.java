package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VerticalScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_scroll_view);
        getSupportActionBar().setTitle("VerticalScrollView");
    }
}