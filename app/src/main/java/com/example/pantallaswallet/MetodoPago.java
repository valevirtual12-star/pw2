package com.example.pantallaswallet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MetodoPago extends AppCompatActivity {

    private ImageView btnBack;
    private View rowVisa;
    private View rowBank;
    private Button btnAddMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments_methods);

        btnBack = findViewById(R.id.btnBack);
        rowVisa = findViewById(R.id.rowVisa);
        rowBank = findViewById(R.id.rowBank);
        btnAddMethod = findViewById(R.id.btnAddMethod);

        btnBack.setOnClickListener(v -> finish());

        rowVisa.setOnClickListener(v ->
                Toast.makeText(this, "Visa **** 4321 seleccionada", Toast.LENGTH_SHORT).show()
        );

        rowBank.setOnClickListener(v ->
                Toast.makeText(this, "Banco Estado **** 8890 seleccionado", Toast.LENGTH_SHORT).show()
        );

        btnAddMethod.setOnClickListener(v ->
                Toast.makeText(this, "Agregar método de pago no disponible aún", Toast.LENGTH_SHORT).show()
        );
    }
}