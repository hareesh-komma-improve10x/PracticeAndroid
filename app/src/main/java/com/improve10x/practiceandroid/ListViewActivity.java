package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;
    private ArrayList<String> names;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("ListView");
        setData();
        handleNamesListView();
    }

    private void handleNamesListView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        binding.namesLv.setAdapter(arrayAdapter);
        binding.namesLv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, String.valueOf(names.get(position)), Toast.LENGTH_SHORT).show();
        });
    }

    private void setData() {
        names = new ArrayList<>();
        names.add("Hareesh");
        names.add("Sunitha");
        names.add("Sumanth");
        names.add("Anupama");
        names.add("Suresh");
        names.add("Pullaiah");
        names.add("Rajesh");
        names.add("om");
        names.add("Manoj");
        names.add("SriRaghu");
        names.add("Vinod");
        names.add("Roopa");
        names.add("SriHarsha");
        names.add("Viswa");
        names.add("Renu");
        names.add("Hareesh");
        names.add("Hareesh");
        names.add("Hareesh");
    }
}