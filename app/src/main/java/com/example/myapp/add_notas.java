package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    //comprobar campos
    public boolean comprobarCampos () {
        boolean bo_comprobar = false;
        if (txt_titulo.getText().toString().isEmpty()) {
            Toast.makeText(this, "introducir datos", Toast.LENGTH_SHORT).show();
            bo_comprobar = true;
        }

        if (txt_content.getText().toString().isEmpty()) {
            Toast.makeText(this, "introducir datos", Toast.LENGTH_SHORT).show();
            bo_comprobar = true;
        }

        return bo_comprobar;
    }

    //registrar una com.example.myapp.nota
    public void registrarNota(View view) {

        String titulo =txt_titulo.getText().toString();
        String descripcion = txt_content.getText().toString();

        Nota Pruebas = new Nota(titulo, descripcion);

        if(!comprobarCampos()) {

        Intent atras = new Intent(this,MainActivity.class);

        atras.putExtra("dato_titulo", txt_titulo.getText().toString());
        //atras.putExtra("dato_titulo", titulo);
        //atras.putExtra("dato_contenido",descripcion);

        startActivity(atras);
        Toast.makeText(this,"Guardado con exito",Toast.LENGTH_LONG ).show();
        }

    }



    //metodo para ir para atras
    public void atras (View view) {
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}