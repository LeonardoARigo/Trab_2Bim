package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void escoherSpinner(View view) {

        Intent intent = new Intent(this, Main3Activity.class);
        Bundle pacote = new Bundle();
        Spinner theSpinner = (Spinner)findViewById(R.id.spinner1);
        String escolha =  theSpinner.getSelectedItem().toString();

        if (escolha.equals("ADM")) {
            pacote.putString("Curso", "Administração");

        } else if (escolha.equals("INFO")) {
            pacote.putString("Curso", "Informatica");
        }


    }

  public void irParaTerceiraTela (View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
