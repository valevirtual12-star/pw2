package com.example.pantallaswallet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class HomePageEmpty extends AppCompatActivity {

    private Button btnSendMoney;
    private Button btnRequestMoney;
    private ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_empty);

        btnSendMoney = findViewById(R.id.btnSendMoney);
        btnRequestMoney = findViewById(R.id.btnRequestMoney);
        imgProfile = findViewById(R.id.imgProfile);

        // NAVEGACIÓN
        btnSendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageEmpty.this, SendMoney.class);
                startActivity(intent);
            }
        });

        btnRequestMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageEmpty.this, RequestMoney.class);
                startActivity(intent);
            }
        });

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageEmpty.this, ProfileA.class);
                startActivity(intent);
            }
        });
    }
}