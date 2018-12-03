package com.lourdinas.finalaplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Act_Login extends AppCompatActivity {


    SharedPreferences meusdados;
    public static final String mypreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__login);

        meusdados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        TextView cadastra = findViewById(R.id.btn_Cadastrar);
        Button login = findViewById(R.id.btn_Login);

        final EditText email = findViewById(R.id.edt_email);
        final EditText senha = findViewById(R.id.edt_senha);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String meuemail = email.getText().toString();
                String minhasenha = senha.getText().toString();
                if(meusdados.contains("email") && meusdados.contains("senha")) {
                    if(meuemail.equals(meusdados.getString("email", ""))
                            && minhasenha.equals(meusdados.getString("senha", ""))){

                        Intent ite = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(ite);
                        finish();

                    }else{Toast.makeText(getApplicationContext(), "DEmail e senha invalidos  ", Toast.LENGTH_LONG).show();}
                }else{
                    Toast.makeText(getApplicationContext(), "Não exitem cadastros! ", Toast.LENGTH_LONG).show();
                }
            }
        });

        cadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Act_Login.this, Act_Cadastro.class);
                startActivity(it);
                finish();
            }
        });
    }
}
