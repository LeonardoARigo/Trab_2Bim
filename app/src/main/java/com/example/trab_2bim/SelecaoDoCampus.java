package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SelecaoDoCampus extends AppCompatActivity {

 Intent intent;
 Bundle pacote = new Bundle();
 Integer pinhais = 0;
 Integer colombo = 0;
 Integer curitiba = 0 ;


    public void fazerToast(String texto){
        Toast.makeText(getApplicationContext(),
               texto,
               Toast.LENGTH_SHORT).show();

    }

    public void colocarNoPacote(Integer pinhais,Integer colombo,Integer curitiba){
        pacote.putString("Pinhais",pinhais + " alunos em  pinhais");
        pacote.putString("Colombo",colombo + " alunos em  colombo");
        pacote.putString("Curitiba",curitiba + " alunos em  curitiba");
        intent.putExtras(pacote);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Tela_De_Selecao_De_Campus);

        intent = new Intent(this, TelaDoFormulario.class);

        ListView listViewDaTela = findViewById(R.id.campi);


        listViewDaTela.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        fazerToast( "Cadastrado em pinhais");
                        pinhais++;
                        colocarNoPacote(pinhais,colombo,curitiba);

                        break;
                    case 1:
                        fazerToast( "Cadastrado em Colombo");
                        colombo++;
                        colocarNoPacote(pinhais,colombo,curitiba)

                        break;
                    case 2:

                        fazerToast( "Cadastrado em Curitiba");
                        curitiba++;
                        colocarNoPacote(pinhais,colombo,curitiba);

                        break;
                }
            }
        });
    }
}


