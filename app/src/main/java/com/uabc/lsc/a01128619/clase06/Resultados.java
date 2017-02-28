package com.uabc.lsc.a01128619.clase06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Resultados extends AppCompatActivity {

    Intent intent;
    String componente;
    EditText txtField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        txtField=(EditText)findViewById(R.id.editText);
        intent =getIntent();
        componente=intent.getStringExtra("Nombre");
        txtField.setText(componente);


    }
}
