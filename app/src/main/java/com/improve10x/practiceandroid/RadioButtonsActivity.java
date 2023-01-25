package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivityCheckBoxBinding;
import com.improve10x.practiceandroid.databinding.ActivityRadioButtonsBinding;

public class RadioButtonsActivity extends AppCompatActivity {

    ActivityRadioButtonsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Radio Buttons");
        handleButton();
    }

    private void handleButton() {
        binding.selectBtn.setOnClickListener(view -> {
            if(binding.maleRadio.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_LONG).show();
            }
            if (binding.femaleRadio.isChecked()) {
                Toast.makeText(this, "Female", Toast.LENGTH_LONG).show();
            }
        });
    }
}