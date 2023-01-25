package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    private Button submitBtn;
    private ToggleButton button1Btn;
    private ToggleButton button2Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        getSupportActionBar().setTitle("ToggleButton");
        setupViews();
        handleButton();
    }

    private void handleButton() {
        submitBtn.setOnClickListener(view -> {
            StringBuilder result = new StringBuilder();
            result.append("button1Btn: ").append(button1Btn.getText());
            result.append("button2Btn: ").append(button2Btn.getText());
            Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
        });
    }

    private void setupViews() {
        submitBtn = findViewById(R.id.submit_btn);
        button1Btn = findViewById(R.id.button1_btn);
        button2Btn = findViewById(R.id.button2_btn);
    }
}