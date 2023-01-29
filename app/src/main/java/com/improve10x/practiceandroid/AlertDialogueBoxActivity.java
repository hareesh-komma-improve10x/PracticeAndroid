package com.improve10x.practiceandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivityAleartDialogueBoxBinding;

import java.util.Timer;

public class AlertDialogueBoxActivity extends AppCompatActivity {

    private ActivityAleartDialogueBoxBinding binding;
    private AlertDialog.Builder builder;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAleartDialogueBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("AlertDialog");
        builder = new AlertDialog.Builder(this);
        handleClose();
    }

    private void handleClose() {
        binding.closeAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Welcome To Alert Dialog").setTitle("AlertDialog");
                builder.setMessage("Do you to close the Application")
                        .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Toast.makeText(AlertDialogueBoxActivity.this, "You Choose yes Action for Dialog", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialog.cancel();
                                Toast.makeText(AlertDialogueBoxActivity.this, "You Choose No for Action", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("AlertDialogMessage");
                alertDialog.show();
            }
        });
    }
}