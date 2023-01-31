package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.improve10x.practiceandroid.databinding.ActivityAutoCompleteTextViewBinding;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityAutoCompleteTextViewBinding binding;
    String[] language = {"C", "C++", "Java", "NET", "iPhone", "Android", "ASP.NET", "PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("AutoCompleteTextView");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, language);
        AutoCompleteTextView search = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        search.setThreshold(1);
        search.setAdapter(adapter);
        search.setTextColor(Color.BLACK);
    }
}