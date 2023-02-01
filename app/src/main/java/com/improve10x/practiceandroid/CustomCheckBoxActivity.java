package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceandroid.databinding.ActivityCustomAlertDialogBinding;

public class CustomCheckBoxActivity extends AppCompatActivity {

    private ActivityCustomAlertDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Custom CheckBox");
    }
}