package com.example.dramalist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private EditText email, senha;
    private AppCompatButton bt_entrar;
    //private fazer a autenticacao com if simples tal qual foto no wpp

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String varEmail = email.getText().toString();
                String varSenha = senha.getText().toString();

                if(varEmail.equals("victoria.resende@ibm.com") && varSenha.equals("1010")){
                    Intent intent = new Intent(FormLogin.this, TelaPrincipal.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Login inválido",
                            Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    private void IniciarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
        email = findViewById(R.id.edit_email);
        senha = findViewById(R.id.edit_senha);
        bt_entrar = findViewById(R.id.bt_entrar);
    }


}