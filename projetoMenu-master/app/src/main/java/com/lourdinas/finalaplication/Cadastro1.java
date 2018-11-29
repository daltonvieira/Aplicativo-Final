package com.lourdinas.finalaplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro1 extends AppCompatActivity {

    SharedPreferences meusdados;
    public static final String mypreference = "call";

    EditText email;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro1);

        TextView cadastra = findViewById(R.id.btn_Cadastrar);
        Button login = findViewById(R.id.btn_Login);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.edt_email);
        senha = findViewById(R.id.edt_senha);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String meuemail = email.getText().toString();
                String minhasenha = senha.getText().toString();
                if(meusdados.contains("email") && meusdados.contains("senha")) {
                    if(meuemail.equals(meusdados.getString("email", ""))
                            && minhasenha.equals(meusdados.getString("senha", ""))){

                        Toast.makeText(getApplicationContext(), "Senha e email validos ", Toast.LENGTH_LONG).show();
                    }else{Toast.makeText(getApplicationContext(), "DEmail e senha invalidos  ", Toast.LENGTH_LONG).show();}
                }else{
                    Toast.makeText(getApplicationContext(), "Dados Invalidos ", Toast.LENGTH_LONG).show();
                }
            }
        });
        cadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ite = new Intent(getApplicationContext(), Cadastro2.class);
                startActivity(ite);
                finish();

            }
        });
    }
}

