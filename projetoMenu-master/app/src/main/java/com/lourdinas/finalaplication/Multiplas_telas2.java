package com.lourdinas.finalaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Multiplas_telas2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplas_telas2);

        final EditText idade = (EditText) findViewById(R.id.edt_idade);
        Button sair = findViewById(R.id.btn_sair);
        Button cadastrar = findViewById(R.id.btn_cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Multiplas_telas2.this, Multiplas_Telas3.class);
                intent.putExtra("idade", idade.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Multiplas_telas2.this, Multiplas_Telas.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
