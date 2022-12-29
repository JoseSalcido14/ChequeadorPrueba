package com.example.checador.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbEmpleados extends DbHelper{
    Context context;
    public DbEmpleados(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long insertarEmpleado(String nombre,String telefono,String correo_electronico){
        long id = 0;
        try {
        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nombre", nombre);
        values.put("telefono", telefono);
        values.put("correo_electronico", correo_electronico);
        id = db.insert(TABLE_EMPLEADOS, null, values);
        } catch (Exception ex){
            ex.toString();
        }
        return id;
    }
}
