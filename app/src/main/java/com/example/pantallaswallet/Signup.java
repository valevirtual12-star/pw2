package com.example.pantallaswallet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    private Button btnSignupPrimary;
    private Button btnSignupSecondary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignupPrimary = findViewById(R.id.btnSignupPrimary);
        btnSignupSecondary = findViewById(R.id.btnSignupSecondary);

        // Al completar el registro, redirigir al usuario a LoginActivity
        btnSignupPrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        // Botón secundario para volver o reiniciar el flujo
        btnSignupSecondary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}