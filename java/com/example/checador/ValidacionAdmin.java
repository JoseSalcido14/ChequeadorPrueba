package com.example.checador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ValidacionAdmin extends AppCompatActivity {
    EditText et_password_admin;
    Button btn_confirmar_clave_admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion_admin);
        et_password_admin = findViewById(R.id.et_password_admin);
        btn_confirmar_clave_admin = findViewById(R.id.btn_confirmar_clave_admin);

        btn_confirmar_clave_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  clave_admin = et_password_admin.getText().toString();
                //if (clave_admin=="12345"){
                Intent intent = new Intent(ValidacionAdmin.this,OpcionesAdmin.class);
                startActivity(intent);
                et_password_admin.setText("");//}
            }
        });
    }
}