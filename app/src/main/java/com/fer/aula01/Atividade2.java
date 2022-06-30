package com.fer.aula01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Atividade2 extends AppCompatActivity {

    Button btnAt1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade_2);

        btnAt1 = findViewById(R.id.btnAt1);
        btnAt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Atividade2.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
