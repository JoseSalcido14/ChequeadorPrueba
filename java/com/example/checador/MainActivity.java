package com.example.checador;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.checador.db.DbHelper;

public class MainActivity extends AppCompatActivity {
    EditText et_id_empleado;
    Button btn_confirmar_id_empleado, btn_crear;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_id_empleado = findViewById(R.id.et_id_empleado);
        btn_crear = findViewById(R.id.btn_crear);
        btn_confirmar_id_empleado = findViewById(R.id.btn_confirmar_id_empleado);
        btn_confirmar_id_empleado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Funciones.class);
                startActivity(intent);
                et_id_empleado.setText("");
            }
        });
        btn_crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHelper dbHelper = new DbHelper(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if (db != null){
                    Toast.makeText(MainActivity.this,"si jalo", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"no jalo", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.modo_admin,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.modo_admin:
                modoAdmin();
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }
    }
    private void modoAdmin(){
        Intent intent = new Intent(this,ValidacionAdmin.class);
        startActivity(intent);
    }
}