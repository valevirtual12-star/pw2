package com.example.pantallaswallet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EditInfoActivity extends AppCompatActivity {

    private ImageView btnBack;
    private EditText etName;
    private EditText etEmail;
    private EditText etPhone;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_info);

        // 1. Inicializar vistas
        btnBack = findViewById(R.id.btnBack);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        btnSave = findViewById(R.id.btnSave);

        // 2. Cargar información actual (Ejemplo)
        loadUserData();

        // 3. Configurar listeners
        btnBack.setOnClickListener(v -> finish()); // Regresa a la pantalla anterior

        btnSave.setOnClickListener(v -> saveInformation());
    }

    private void loadUserData() {
        // Datos de muestra
        etName.setText("Valentina López");
        etEmail.setText("valentina.lopez@email.com");
        etPhone.setText("+56 9 1234 5678");
    }

    private void saveInformation() {
        String name = etName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();

        // Validaciones básicas
        if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
            Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Simulación de guardado exitoso
        Toast.makeText(this, "Información actualizada correctamente", Toast.LENGTH_SHORT).show();
        finish(); // Cierra la pantalla tras guardar
    }
}