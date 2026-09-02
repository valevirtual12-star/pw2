package com.example.pantallaswallet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SecuritySetings extends AppCompatActivity {

    private ImageView btnBack;
    private EditText etCurrentPassword;
    private EditText etNewPassword;
    private EditText etConfirmPassword;
    private SwitchMaterial switchBiometrics;
    private Button btnUpdatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_setings);

        // 1. Inicialización de vistas
        btnBack = findViewById(R.id.btnBack);
        etCurrentPassword = findViewById(R.id.etCurrentPassword);
        etNewPassword = findViewById(R.id.etNewPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        switchBiometrics = findViewById(R.id.switchBiometrics);
        btnUpdatePassword = findViewById(R.id.btnUpdatePassword);

        // 2. Configuración de Listeners
        btnBack.setOnClickListener(v -> finish());

        switchBiometrics.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String message = isChecked ? "Biometría activada" : "Biometría desactivada";
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        });

        btnUpdatePassword.setOnClickListener(v -> handlePasswordUpdate());
    }

    private void handlePasswordUpdate() {
        String currentPass = etCurrentPassword.getText().toString().trim();
        String newPass = etNewPassword.getText().toString().trim();
        String confirmPass = etConfirmPassword.getText().toString().trim();

        if (currentPass.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty()) {
            Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!newPass.equals(confirmPass)) {
            Toast.makeText(this, "Las nuevas contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            return;
        }

        if (newPass.length() < 6) {
            Toast.makeText(this, "La contraseña debe tener al menos 6 caracteres", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Contraseña actualizada exitosamente", Toast.LENGTH_SHORT).show();
        finish();
    }
}