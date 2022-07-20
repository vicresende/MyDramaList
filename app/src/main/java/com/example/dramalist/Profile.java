package com.example.dramalist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    //private Button bt_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().hide();

        //String email = getIntent().getStringExtra("chave_email");

        //como fazer o email aparecer na tela de profile vindo daqui?
        //criar um dialog com um tem certeza que quer sair? antes de ir de profile para formlogin
        /*
        bt_sair = findViewById(R.id.bt_sair);

        bt_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, FormLogin.class);
                startActivity(intent);
            }
        });
        */
    }

    public void abrir_dialog(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("SAIR");
        dialog.setMessage("Tem certeza que deseja sair?");

        dialog.setCancelable(false);

        dialog.setIcon(android.R.drawable.ic_dialog_alert);

        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Você saiu!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Profile.this, FormLogin.class);
                startActivity(intent);
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Operação cancelada!", Toast.LENGTH_LONG).show();
            }
        });

        dialog.create();
        dialog.show();

    }

}