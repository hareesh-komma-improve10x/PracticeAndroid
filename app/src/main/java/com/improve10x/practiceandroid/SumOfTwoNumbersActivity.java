package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SumOfTwoNumbersActivity extends AppCompatActivity {

    private EditText firstTxt;
    private EditText secondTxt;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_of_two_numbers);
        getSupportActionBar().setTitle("Sum of two number");
        handleButton();
        setupViews();

    }

    private void setupViews() {
        firstTxt = findViewById(R.id.first_txt);
        secondTxt = findViewById(R.id.second_txt);
        addBtn = findViewById(R.id.add_btn);
    }

    private void handleButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            String first = firstTxt.getText().toString();
            String second = secondTxt.getText().toString();
            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);
            int sum = a + b;
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }


}