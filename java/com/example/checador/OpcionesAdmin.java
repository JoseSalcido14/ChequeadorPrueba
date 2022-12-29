package com.example.checador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesAdmin extends AppCompatActivity {
    Button btn_registrar_empleados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_admin);
        btn_registrar_empleados = findViewById(R.id.btn_registrar_empleados);
        btn_registrar_empleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcionesAdmin.this,RegistroEmpleados.class);
                startActivity(intent);
            }
        });
    }
}