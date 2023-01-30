package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivityTextWatcherBinding;

import java.util.ArrayList;

public class TextWatcherActivity extends AppCompatActivity {

    private ActivityTextWatcherBinding binding;
    private ArrayAdapter<String> adapter;
    private String products[] = {"Apple", "Banana", "PineApple", "Orange", "Papaya", "Melon", "Grapes", "Water Melon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("TextWatcher");
        handleProducts();
    }

    private void handleProducts() {
        adapter = new ArrayAdapter<String>(this, R.layout.text_watcher_item, R.id.product_name_txt, products);
        binding.listLv.setAdapter(adapter);
        binding.searchTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(TextWatcherActivity.this, "Before Text Change", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(TextWatcherActivity.this, "After Text Change", Toast.LENGTH_SHORT).show();
            }
        });
    }
}