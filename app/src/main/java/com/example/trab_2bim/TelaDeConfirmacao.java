package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaDeConfirmacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        Bundle pacote = intent.getExtras();

        String curso = pacote.getString("Curso");
        String nome =  pacote.getString("Nome");
        String turno = pacote.getString("Turno");

        TextView cursoEscolhido = (TextView) findViewById(R.id.mostrar_curso);
        cursoEscolhido.setText(curso);

        TextView nomeDoAluno = (TextView) findViewById(R.id.mostrar_aluno);
        nomeDoAluno.setText(nome);

        TextView turnoEscolhido = (TextView) findViewById(R.id.mostrar_turno);
        turnoEscolhido.setText(turno);


    }


    public void mudardetela (View view){
        Intent intent = new Intent(this, SelecaoDoCampus.class);
        startActivity(intent);
    }
}