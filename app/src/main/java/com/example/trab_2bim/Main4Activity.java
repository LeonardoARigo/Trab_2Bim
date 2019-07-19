package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Integer pinhais = 0;
    Integer curitiba = 0;
    Integer colombo = 0;

    public void fazertoast(String texto){
        Toast.makeText(getApplicationContext(),
                texto,
                Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ListView listViewDaTela = findViewById(R.id.campi);
        listViewDaTela.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        pinhais++;
                        fazertoast(pinhais.toString() + " alunos em pinhais");
                        break;
                    case 1:
                        colombo++;
                        fazertoast(colombo.toString() + " alunos em Colombo");

                        break;
                    case 2:
                        curitiba++;
                        fazertoast(curitiba.toString() + " alunos em Curitiba");
                        break;
                }
            }
        });
    }
}