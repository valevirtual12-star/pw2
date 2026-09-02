package com.example.pantallaswallet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SendMoney extends AppCompatActivity {

    private ImageView btnBack;
    private ImageView imgUserProfile;
    private TextView tvUserName;
    private TextView tvUserEmail;
    private EditText etAmount;
    private EditText etNote;
    private Button btnDeposit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        // 1. Inicializar vistas
        btnBack = findViewById(R.id.btnBack);
        imgUserProfile = findViewById(R.id.imgUserProfile);
        tvUserName = findViewById(R.id.tvUserName);
        tvUserEmail = findViewById(R.id.tvUserEmail);
        etAmount = findViewById(R.id.etAmount);
        etNote = findViewById(R.id.etNote);
        btnDeposit = findViewById(R.id.btnDeposit);

        // 2. Configurar listeners
        btnBack.setOnClickListener(v -> finish());

        btnDeposit.setOnClickListener(v -> processDeposit());
    }

    private void processDeposit() {
        String amountStr = etAmount.getText().toString().trim();
        String note = etNote.getText().toString().trim();

        if (amountStr.isEmpty()) {
            Toast.makeText(this, "Por favor ingresa la cantidad", Toast.LENGTH_SHORT).show();
            return;
        }

        double amount = Double.parseDouble(amountStr);
        if (amount <= 0) {
            Toast.makeText(this, "El monto debe ser mayor a 0", Toast.LENGTH_SHORT).show();
            return;
        }

        // Lógica de depósito exitoso
        Toast.makeText(this, "Depósito de $" + amountStr + " realizado con éxito", Toast.LENGTH_LONG).show();
        finish();
    }
}