package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.improve10x.practiceandroid.databinding.ActivityCustomAlertDialogBinding;
import com.improve10x.practiceandroid.databinding.CustomAlertItemBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {

    private ActivityCustomAlertDialogBinding binding;
    private Dialog dialog;
    private CustomAlertItemBinding customAlertItemBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Custom Alert Dialog");
        handleAlertClick();
    }

    private void handleAlertClick() {
        binding.alertBtn.setOnClickListener(view -> {
            dialog = new Dialog(this);
            customAlertItemBinding = CustomAlertItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customAlertItemBinding.getRoot());
            customAlertItemBinding.dismissBtn.setOnClickListener(view1 -> {
                finish();
            });
            customAlertItemBinding.closeIv.setOnClickListener(view1 -> {
                dialog.dismiss();
            });
            customAlertItemBinding.alertMessageTxt.setText("Alert....!!!!");
            dialog.show();
        });
    }
}