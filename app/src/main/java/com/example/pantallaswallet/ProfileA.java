package com.example.pantallaswallet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileA extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        View optionEditInfo = findViewById(R.id.cardForm);
        View optionPayment = findViewById(R.id.cardPayment);
        View optionSecurity = findViewById(R.id.cardSecurity);

        if (optionEditInfo != null) {
            optionEditInfo.setOnClickListener(v -> {
                Intent intent = new Intent(ProfileA.this, EditInfoActivity.class);
                startActivity(intent);
            });
        }

        if (optionPayment != null) {
            optionPayment.setOnClickListener(v -> {
                Intent intent = new Intent(ProfileA.this, MetodoPago.class);
                startActivity(intent);
            });
        }

        if (optionSecurity != null) {
            optionSecurity.setOnClickListener(v -> {
                Intent intent = new Intent(ProfileA.this, SecuritySetings.class);
                startActivity(intent);
            });
        }
    }
}