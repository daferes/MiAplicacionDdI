package com.danielferrer.myapplication2dii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNombre = findViewById(R.id.etNombre);
        EditText etApellidos = findViewById(R.id.etApellidos);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etDireccion = findViewById(R.id.etDireccion);

        RadioButton rbHombre = findViewById(R.id.rbHombre);
        RadioButton rbMujer = findViewById(R.id.rbMujer);
        RadioButton rbNo = findViewById(R.id.rbNo);

        CheckBox cbESO = findViewById(R.id.cbESO);
        CheckBox cbFPGM = findViewById(R.id.cbFPGM);
        CheckBox cbFPGS = findViewById(R.id.cbFPGS);

        Button bBorrar = findViewById(R.id.bBorrar);
        Button bEnviar = findViewById(R.id.bEnviar);

        bBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etNombre.setText(R.string.nombre);
                etApellidos.setText(R.string.apellidos);
                etEmail.setText(R.string.email);
                etDireccion.setText(R.string.direccion);

                rbHombre.setChecked(false);
                rbMujer.setChecked(false);
                rbNo.setChecked(false);

                cbESO.setChecked(false);
                cbFPGM.setChecked(false);
                cbFPGS.setChecked(false);

                Toast.makeText(MainActivity.this, R.string.borrado, Toast.LENGTH_SHORT).show();
            }
        });

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.enviado, Toast.LENGTH_SHORT).show();
            }
        });

        rbHombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbHombre.isChecked()){
                    rbHombre.setChecked(false);
                }else{
                    rbHombre.setChecked(true);
                    rbMujer.setChecked(false);
                    rbNo.setChecked(false);
                }
            }
        });

        rbMujer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbMujer.isChecked()){
                    rbMujer.setChecked(false);
                }else{
                    rbMujer.setChecked(true);
                    rbHombre.setChecked(false);
                    rbNo.setChecked(false);
                }
            }
        });

        rbNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbNo.isChecked()){
                    rbNo.setChecked(false);
                }else{
                    rbNo.setChecked(true);
                    rbHombre.setChecked(false);
                    rbMujer.setChecked(false);
                }
            }
        });
    }
}