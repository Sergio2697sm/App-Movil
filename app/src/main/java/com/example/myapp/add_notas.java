package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.myapp.nota;

import java.util.ArrayList;

public class add_notas extends AppCompatActivity {

    private EditText txt_titulo,txt_content;
    //private ArrayList<String> nota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notas);

        txt_titulo = (EditText)findViewById(R.id.txt_titulo);
        txt_content = (EditText)findViewById(R.id.txt_content);
    }

    //registrar una com.example.myapp.nota
    public void registrarNota(View view) {

        String titulo =txt_titulo.getText().toString();
        String descripcion = txt_content.getText().toString();


        Intent atras = new Intent(this,MainActivity.class);

        atras.putExtra("dato_titulo", titulo);
        atras.putExtra("dato_contenido",descripcion);

        startActivity(atras);
        Toast.makeText(this,"Guardado con exito",Toast.LENGTH_LONG ).show();
    }

    //metodo para ir para atras
    public void atras (View view) {
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}