package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivitySpinnerBinding;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private ActivitySpinnerBinding binding;
    private ArrayList<String> villages;
    private Spinner villagesSp;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Spinner");
        setData();
        spinnerForVillagesNames();
    }

    private void spinnerForVillagesNames() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, villages);
        binding.spinnerSp.setAdapter(arrayAdapter);
        binding.spinnerSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(SpinnerActivity.this, villages.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void setData() {
        villages = new ArrayList<>();
        villages.add("Gopavaram");
        villages.add("Gangavaram");
        villages.add("Gajulapalli");
        villages.add("Mahanandi");
        villages.add("SRPuram");
        villages.add("Nandipalla");
    }
}