package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Bundle pacote = new Bundle();
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = new Intent(this, Main3Activity.class);
        Spinner spinner = (Spinner)findViewById(R.id.spinner1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                Spinner spinner = (Spinner)findViewById(R.id.spinner1);
                String escolha =  spinner.getSelectedItem().toString();

                if (escolha.equals("ADM")) {
                    pacote.putString("Curso", "Administração");
                    ((TextView)findViewById(R.id.test)).setText("ADM");

                } else if (escolha.equals("INFO")) {
                    pacote.putString("Curso", "Informatica");
                    ((TextView)findViewById(R.id.test)).setText("info");
                }
                else {
                    pacote.putString("Curso","ldsjfyhgas");
                    ((TextView)findViewById(R.id.test)).setText("fasdiuhsdfjhi");
                }

            }
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });
    }




    public void irParaTerceiraTela (View view){

         intent.putExtras(pacote);
         startActivity(intent);
    }

}