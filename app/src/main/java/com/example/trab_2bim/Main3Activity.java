package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String curso = bundle.getString("Curso");
        TextView cursoEscolhido = findViewById(R.id.mostrar_curso);
        cursoEscolhido.setText(curso);

    }
}