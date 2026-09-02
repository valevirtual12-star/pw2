package com.example.pantallaswallet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginSignup extends AppCompatActivity {

    private Button btnCreateAccount;
    private Button btnAlreadyHaveAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_login);

        btnCreateAccount = findViewById(R.id.btnCreateAccount);
        btnAlreadyHaveAccount = findViewById(R.id.btnAlreadyHaveAccount);

        // Ir a Pantalla de Registro
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSignup.this, LoginSignup.class);
                startActivity(intent);
            }
        });

        // Ir a Pantalla de Iniciar Sesión (Login)
        btnAlreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSignup.this, Login.class);
                startActivity(intent);
            }
        });
    }
}