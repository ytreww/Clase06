package com.uabc.lsc.a01128619.clase06;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button btn;
    EditText txt;
    RadioButton radio1;
    RadioButton radio2;
    CheckBox check1;
    CheckBox check2;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button3);
        txt = (EditText)findViewById(R.id.editText3);
        radio1=(RadioButton)findViewById(R.id.radioButton5);
        radio2=(RadioButton)findViewById(R.id.radioButton6);
        check1=(CheckBox)findViewById(R.id.checkBox5);
        check2=(CheckBox)findViewById(R.id.checkBox6);
        spin=(Spinner)findViewById(R.id.spinner3);
        intent = new Intent(this,Resultados.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("Nombre", "button");
                startActivity(intent);
            }
        });
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Nombre", "edittext");
                startActivity(intent);
            }
        });
        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Nombre", "radiobutton 1");
                startActivity(intent);
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Nombre", "radiobutton 2");
                startActivity(intent);
            }
        });
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Nombre", "checkbox 1");
                startActivity(intent);
            }
        });
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Nombre", "checkbox 2");
                startActivity(intent);
            }
        });
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spin.setAdapter(adapter);
       

    }

}
