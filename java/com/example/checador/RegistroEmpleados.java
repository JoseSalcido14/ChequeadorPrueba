package com.example.checador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.checador.db.DbEmpleados;

public class RegistroEmpleados extends AppCompatActivity {
    EditText et_nombre_empleado, et_telefono, et_correo_electronico;
    Button btn_confirmar_registro_empleados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_empleados);
        et_nombre_empleado = findViewById(R.id.et_nombre_empleado);
        et_telefono = findViewById(R.id.et_telefono);
        et_correo_electronico = findViewById(R.id.et_correo_electronico);
        btn_confirmar_registro_empleados = findViewById(R.id.btn_confirmar_registro_empleado);
        btn_confirmar_registro_empleados.setOnClickListener(confirmarRegistroEmpleado);
    }
    private View.OnClickListener confirmarRegistroEmpleado = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                DbEmpleados dbEmpleados = new DbEmpleados(RegistroEmpleados.this);
                long id = dbEmpleados.insertarEmpleado(et_nombre_empleado.getText().toString(), et_telefono.getText().toString(), et_correo_electronico.getText().toString());

                if ( id > 0){
                    Toast.makeText(RegistroEmpleados.this,"Registro guardado",Toast.LENGTH_LONG).show();
                    limpiar();
                }else {
                    Toast.makeText(RegistroEmpleados.this,"Error al guardar registro",Toast.LENGTH_LONG).show();

                }
            }
        };
    private void limpiar(){
        et_nombre_empleado.setText("");
        et_telefono.setText("");
        et_correo_electronico.setText("");
    }
}