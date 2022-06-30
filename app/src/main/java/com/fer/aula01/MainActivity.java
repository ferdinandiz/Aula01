package com.fer.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn2, btnTela2, btnVoltar, btnAt2, btnOK;
    TextView txtSaida;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn2 = findViewById(R.id.btn2);
        btnTela2 = findViewById(R.id.btnTela2);
        editText = findViewById(R.id.editText);
        txtSaida = findViewById(R.id.txtSaida);
        btnOK = findViewById(R.id.btnOK);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sair();
            }
        });

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.tela_2);
                btnVoltar = findViewById(R.id.btnVoltar);
                btnAt2 = findViewById(R.id.btnAt2);
                btnVoltar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                });

                btnAt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this,Atividade2.class);
                        startActivity(i);
                        finish();
                    }
                });
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSaida.setText(editText.getText().toString());
            }
        });

    }

    public void sair(){
        finish();
    }


}