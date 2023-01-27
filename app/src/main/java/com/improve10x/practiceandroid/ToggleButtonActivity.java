package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.improve10x.practiceandroid.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("ToggleButton");
        handleButton();
    }

    private void handleButton() {
        binding.submitBtn.setOnClickListener(view -> {
            StringBuilder result = new StringBuilder();
            result.append("button1Btn: ").append(binding.button1Btn.getText());
            result.append("button2Btn: ").append(binding.button2Btn.getText());
            Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
        });
    }
}