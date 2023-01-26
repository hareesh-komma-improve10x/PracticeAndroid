package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.improve10x.practiceandroid.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {

    ActivityDatePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("DatePicker");
        handleButton();
    }

    private void handleButton() {
        binding.changeDateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dateTxt.setText("Change Date : " + getCurrentDate());
                binding.dateTxt.setText("Change Date : " + getCurrentDate());
            }

            private String getCurrentDate() {
                StringBuilder builder = new StringBuilder();
                builder.append((binding.datePicker.getMonth() + 1) + "-");
                builder.append((binding.datePicker.getDayOfMonth() + "-"));
                builder.append(binding.datePicker.getYear());
                return builder.toString();
            }
        });
    }
}