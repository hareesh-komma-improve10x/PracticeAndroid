package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        getSupportActionBar().setTitle("Custom Toast");
        showCustomToast();
    }

    private void showCustomToast() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View layout = layoutInflater.inflate(R.layout.custome_toast, (ViewGroup) findViewById(R.id.linear_layout));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}