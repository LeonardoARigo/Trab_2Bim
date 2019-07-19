package com.example.trab_2bim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
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

                } else if (escolha.equals("INFO")) {
                    pacote.putString("Curso", "Informatica");
                }

            }
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }

    public void exibirAlertDialog (){
        AlertDialog.Builder builderAlert = new AlertDialog.Builder(this);
        builderAlert.setTitle("Confirmação");
        builderAlert.setMessage("Confirma o cadastro do aluno?");

        DialogInterface.OnClickListener botaoSim = new DialogInterface.OnClickListener() {
            @Override
            public void onClick (DialogInterface dialog,int which) {
                intent.putExtras(pacote);
                startActivity(intent);
            }
        };
        builderAlert.setPositiveButton( "Sim", botaoSim);
        builderAlert.create().show();
            }

    public void notificar(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            NotificationChannel channel =
                    new NotificationChannel("my_channel_id",
                            "my_channel",
                            NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            nm.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"my_channel_id");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setContentTitle("Cadastro");
        builder.setContentText("Aluno Cadastrado!");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(123456, builder.build());
    }

    public void onRadioButtonClicked(View view) {
        RadioButton radioButton =(RadioButton ) view;
        int  id = radioButton.getId();
        switch(id) {
            case R.id.manha:
                pacote.putString("Turno","Manhã");
                break;
            case R.id.tarde:
                pacote.putString("Turno","Tarde");
                break;
        }
    }

    public void irParaTerceiraTela (View view){
        String aluno = ((TextView)findViewById(R.id.editText1)).getText().toString();
        pacote.putString("Nome",aluno);
        notificar();
        exibirAlertDialog();
    }

}