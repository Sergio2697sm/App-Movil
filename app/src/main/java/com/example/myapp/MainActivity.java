package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView lv1;
    private ArrayList<String> nota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = (ListView)findViewById(R.id.panel);

        //recuperar lo del otro activity
        String dato_titulo = getIntent().getStringExtra("dato_titulo");
        Log.v(dato_titulo);
        //String dato_contenido = getIntent().getStringExtra("dato_contenido");

        Bundle parametros = new Bundle();
       String datos = parametros.getString(dato_titulo);

        //meterlo en el array
        nota =new ArrayList<String>();
        nota.add("hola " + datos);


        ArrayAdapter <String> adapter = new ArrayAdapter<>(this,R.layout.list_item_sergio,nota);
        lv1.setAdapter(adapter);


    }


    //metodo para ir a insertar notas
    public void InsertarNotas(View view) {
        Intent insertar = new Intent(this,add_notas.class);
        startActivity(insertar);
    }
}