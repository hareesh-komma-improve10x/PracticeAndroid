package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {

    ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("RatingBar");
        handleSubmitButton();
    }

    private void handleSubmitButton() {
        binding.submitBtn.setOnClickListener(view -> {
            String rating = String.valueOf(binding.ratingbarRb.getRating());
            Toast.makeText(this, rating, Toast.LENGTH_SHORT).show();
        });
    }
}