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
        handleShowButton();
    }

    private void handleShowButton() {
        binding.selectBtn.setOnClickListener(view -> {
            boolean male = binding.maleRadio.isChecked();
            boolean female = binding.femaleRadio.isChecked();
            String selectedItems = gender (male, female);
            Toast.makeText(this, selectedItems, Toast.LENGTH_SHORT).show();
        });
    }

    private String gender(boolean male, boolean female) {
        String result = "Selected Gender : ";
        if (male) {
            result += "Male";
        }
        if (female) {
            result += "Female";
        }
        return result;
    }
}