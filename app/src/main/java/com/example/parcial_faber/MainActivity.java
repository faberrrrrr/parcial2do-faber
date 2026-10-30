package com.example.parcial_faber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtContrasena;

    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtContrasena = findViewById(R.id.edtContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresar();
            }
        });
    }

    private void ingresar() {

        String usuario = edtUsuario.getText().toString().trim();
        String contrasena = edtContrasena.getText().toString();

        if (usuario.isEmpty() || contrasena.isEmpty()) {

            Toast.makeText(
                    MainActivity.this,
                    "Por favor llenar los campos",
                    Toast.LENGTH_LONG
            ).show();

        } else {

            if (usuario.equalsIgnoreCase("faber") && contrasena.equals("12345678")) {

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("usuario", usuario);
                startActivity(intent);
                finish();

            } else {

                Toast.makeText(
                        MainActivity.this,
                        "Usuario o contraseña incorrectos",
                        Toast.LENGTH_LONG
                ).show();
            }
        }
    }
}