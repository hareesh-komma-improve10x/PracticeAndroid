package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CheckBox");
        handleButton();
    }

    private void handleButton() {
        binding.orderBtn.setOnClickListener(view -> {
            int totalAmount = 0;
            StringBuilder result = new StringBuilder();
            result.append("Selected Items:");
            if (binding.pizzaCheckBox.isChecked()) {
                result.append("\t Pizza 200 Rs");
                totalAmount+= 200;
            }
            if (binding.coffeeCheckBox.isChecked()) {
                result.append("\t Coffee 25 Rs");
                totalAmount+= 25;
            }
            if (binding.burgerCheckBox.isChecked()) {
                result.append("\t Burger 150 Rs");
                totalAmount+= 150;
            }
            result.append("\t Total : " + totalAmount + "Rs");
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }
}