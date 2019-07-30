package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimeiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Primeira_Tela);


    }

    public void mudardetela (View view){
        Intent intent = new Intent(this, SelecaoDoCampus.class);
        startActivity(intent);
    }



}
