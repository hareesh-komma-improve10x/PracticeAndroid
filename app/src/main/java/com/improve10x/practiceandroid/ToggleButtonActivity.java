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
            String button1 = binding.button1Btn.getText().toString();
            String button2 = binding.button2Btn.getText().toString();
            String result = getData(button1, button2);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    private String getData(String button1, String button2) {
        String status1 = "Button1 : " + button1 + "\n";
        String status2 = "Button2 : " + button2;
        String result = status1 += status2;
        return result;
    }
}