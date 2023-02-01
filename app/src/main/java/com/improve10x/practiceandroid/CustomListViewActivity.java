package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.improve10x.practiceandroid.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    private ActivityCustomListViewBinding binding;
    private ArrayList<CustomList> listsLv;
    private CustomListViewAdapter customListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Custom ListView");
        setData();
        customListView();
    }

    private void customListView() {
        customListViewAdapter = new CustomListViewAdapter(this, R.layout.activity_custom_list_view, listsLv);
        binding.customListLv.setAdapter(customListViewAdapter);
    }

    private void setData() {
        listsLv = new ArrayList<>();
        CustomList title = new CustomList();
        title.imageUrl = "https://pluspng.com/img-png/instagram-logo-eps-png-instagram-logo-1784.png";
        title.title = "PsPk";
        title.subTitle = "Dialog";
        listsLv.add(title);
    }
}