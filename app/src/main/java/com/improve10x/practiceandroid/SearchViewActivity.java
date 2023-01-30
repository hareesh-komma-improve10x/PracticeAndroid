package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivitySerachViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySerachViewBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySerachViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("SearchView");
        setData();
        handleSearchView();
    }

    private void handleSearchView() {
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        binding.listLv.setAdapter(adapter);
        binding.searchViewSv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewActivity.this, "No Match Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    private void setData() {
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");
        list.add("Fan");
        list.add("Gun");
        list.add("Hareesh");
        list.add("Icon");
        list.add("Jug");
        list.add("Knight");
        list.add("Lion");
    }
}