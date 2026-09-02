package com.example.pantallaswallet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private Button btnSendMoney;
    private Button btnRequestMoney;
    private ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btnSendMoney = findViewById(R.id.btnSendMoney);
        btnRequestMoney = findViewById(R.id.btnRequestMoney);
        imgProfile = findViewById(R.id.imgProfile);

        // Al presionar 'Enviar dinero', ir a SendMoneyActivity
        btnSendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, ProfileA.class);
                startActivity(intent);
            }
        });

        // Al presionar 'Ingresar dinero', ir a RequestMoneyActivity
        btnRequestMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, SendMoney.class);
                startActivity(intent);
            }
        });

        // Al presionar sobre el perfil, ir a ProfileActivity
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, RequestMoney.class);
                startActivity(intent);
            }
        });
    }
}