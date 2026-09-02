package com.example.pantallaswallet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RequestMoney extends AppCompatActivity {

    private ImageView btnBack;
    private TextView tvUserInitial;
    private TextView tvUserName;
    private TextView tvUserEmail;
    private EditText etAmount;
    private EditText etNote;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_money);

        // 1. Inicializar vistas
        btnBack = findViewById(R.id.btnBack);
        tvUserInitial = findViewById(R.id.tvUserInitial);
        tvUserName = findViewById(R.id.tvUserName);
        tvUserEmail = findViewById(R.id.tvUserEmail);
        etAmount = findViewById(R.id.etAmount);
        etNote = findViewById(R.id.etNote);
        btnSubmit = findViewById(R.id.btnSubmit);

        // 2. Cargar datos del usuario
        setupUserProfile();

        // 3. Configurar listeners
        btnBack.setOnClickListener(v -> finish());
        btnSubmit.setOnClickListener(v -> processSendMoney());
    }

    private void setupUserProfile() {
        String name = "Valentina López";
        tvUserName.setText(name);
        tvUserEmail.setText("valentina.lopez@email.com");

        // Obtener la primera letra para el ícono circular
        if (!name.isEmpty()) {
            tvUserInitial.setText(String.valueOf(name.charAt(0)).toUpperCase());
        }
    }

    private void processSendMoney() {
        String amountStr = etAmount.getText().toString().trim();
        String note = etNote.getText().toString().trim();

        if (amountStr.isEmpty()) {
            Toast.makeText(this, "Por favor ingresa la cantidad a enviar", Toast.LENGTH_SHORT).show();
            return;
        }

        double amount = Double.parseDouble(amountStr);
        if (amount <= 0) {
            Toast.makeText(this, "El monto debe ser mayor a 0", Toast.LENGTH_SHORT).show();
            return;
        }

        // Simulación del envío exitoso
        Toast.makeText(this, "Envío de $" + amountStr + " realizado con éxito", Toast.LENGTH_LONG).show();
        finish();
    }
}