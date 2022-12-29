package com.example.checador;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Funciones extends AppCompatActivity {
    //Declaracion de herramientas
    private Spinner spinner1;
    private Button btn_confirmar_funciones;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funciones);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        btn_confirmar_funciones = findViewById(R.id.btn_confirmar_funcion);
        String [] funciones = {"Cargar","Descargar","Hora de comida","Salida"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,funciones);
        spinner1.setAdapter(adapter);
        btn_confirmar_funciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Funciones.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}