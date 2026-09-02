package com.example.pantallaswallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class Bienvenida extends AppCompatActivity {

    // Tiempo de espera en milisegundos (3 segundos)
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Handler para retrasar la transición durante 3 segundos
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crear el Intent para ir a la pantalla de Registro / Login
                Intent intent = new Intent(Bienvenida.this, LoginSignup.class);
                startActivity(intent);

                // Finalizar SplashActivity para que el usuario no vuelva a ella al presionar 'Atrás'
                finish();
            }
        }, SPLASH_DURATION);
    }
}