package com.improve10x.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.improve10x.practiceandroid.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CheckBox");
        handleButton();
    }

    private void handleButton() {
        binding.orderBtn.setOnClickListener(view -> {
            // get selected items
            boolean pizza = binding.pizzaCheckBox.isChecked();
            boolean coffee = binding.coffeeCheckBox.isChecked();
            boolean burger = binding.burgerCheckBox.isChecked();
            String orderDetails = createOrder(pizza, coffee, burger);
            // displaying the message and total amount
            binding.orderDetailsTxt.setText(orderDetails);
        });
    }

    private String createOrder(boolean pizza, boolean coffee, boolean burger) {
        int totalAmount = 0;
        String orderDetails = "Selected Items";
        if (pizza) {
            totalAmount += 100;
            orderDetails += "\npizza : 100Rs";
        }
        if (coffee) {
            totalAmount += 50;
            orderDetails += "\ncoffee : 50Rs";
        }
        if (burger) {
            totalAmount += 120;
            orderDetails += "\nburger : 120";
        }
        orderDetails += "\nTotal : Rs." + totalAmount;
        return orderDetails;
    }
}