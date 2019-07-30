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
        setContentView(R.layout.Tela_De_Confirmacao);

        Intent intent = getIntent();
        Bundle pacote = intent.getExtras();

        String curso = pacote.getString("Curso");
        TextView cursoEscolhido = (TextView) findViewById(R.id.mostrar_curso);
        cursoEscolhido.setText(curso);

        String nome =  pacote.getString("Nome");
        TextView nomeDoAluno = (TextView) findViewById(R.id.mostrar_aluno);
        nomeDoAluno.setText(nome);

        String turno = pacote.getString("Turno");
        TextView turnoEscolhido = (TextView) findViewById(R.id.mostrar_turno);
        turnoEscolhido.setText(turno);

        String pinhais = pacote.getString("Pinhais");
        TextView alunospinhais = (TextView) findViewById(R.id.mostraralunosCampusPinhais);
        alunospinhais.setText(pinhais);

        String colombo = pacote.getString("Curitiba");
        TextView alunoscolombo = (TextView) findViewById(R.id.mostraralunosCampusColombo);
        alunoscolombo.setText(colombo);

        String curitiba = pacote.getString("Colombo");
        TextView alunoscuritiba = (TextView) findViewById(R.id.mostraralunosCampusCuritiba);
        alunoscuritiba.setText(curitiba);

    }

    public void mudardetela (View view){
        Intent intent = new Intent(this, SelecaoDoCampus.class);
        startActivity(intent);
    }
}