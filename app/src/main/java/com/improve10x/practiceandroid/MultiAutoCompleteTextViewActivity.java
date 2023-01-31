package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.improve10x.practiceandroid.databinding.ActivityMultiAutoCompleteTextViewBinding;

public class MultiAutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityMultiAutoCompleteTextViewBinding binding;
    private String[] androidVersionNames = {"Aestro", "Blender", "CupCake", "Donut", "Eclair", "Froyo", "Gingerbread", "HoneyComb", "IceCream Sandwich"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMultiAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MultiAutoCompleteTextView simpleMultiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> versionNames = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, androidVersionNames);
        simpleMultiAutoCompleteTextView.setAdapter(versionNames);
        simpleMultiAutoCompleteTextView.setThreshold(1);
        simpleMultiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}