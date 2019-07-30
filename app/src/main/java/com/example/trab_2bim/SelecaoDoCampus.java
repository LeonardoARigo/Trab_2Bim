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

public class SelecaoDoCampus extends AppCompatActivity {

 Intent intent;
 Bundle pacote = new Bundle();
 Integer pinhais;
 Integer colombo;
 Integer curitiba;


    public void fazerToast(String texto){
        Toast.makeText(getApplicationContext(),
               texto,
               Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        intent = new Intent(this, TelaDoFormulario.class);

        ListView listViewDaTela = findViewById(R.id.campi);
        listViewDaTela.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        fazerToast( "Cadastrado em pinhais");


                        break;
                    case 1:
                        fazerToast( "Cadastrado em Colombo");

                        break;
                    case 2:
                        fazerToast( "Cadastrado em Curitiba");

                        break;
                }
            }
        });
    }

    public void mudardetela (View view){
               startActivity(intent);
    }

}


