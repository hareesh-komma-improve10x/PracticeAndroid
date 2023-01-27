package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivitySumOfTwoNumbersBinding;

public class SumOfTwoNumbersActivity extends AppCompatActivity {

    ActivitySumOfTwoNumbersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySumOfTwoNumbersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Sum of two number");
        handleSumOfTwoNumbers();

    }

    private void handleSumOfTwoNumbers() {
        binding.addBtn.setOnClickListener(view -> {
            // read a and b
            String first = binding.firstTxt.getText().toString();
            String second = binding.secondTxt.getText().toString();
            // convert to it int
            String sum = add(first, second);
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }
    // Business logic - only main operations.Strictly no ui changes
    private String add(String first, String second) {
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);
        int sum = number1 + number2;
        return String.valueOf(sum);
    }
}