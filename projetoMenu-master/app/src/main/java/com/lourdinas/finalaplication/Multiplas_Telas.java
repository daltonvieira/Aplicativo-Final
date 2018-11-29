package com.lourdinas.finalaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Multiplas_Telas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplas__telas);

        Button entrar = (Button)  findViewById(R.id.btn_entra);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Multiplas_Telas.this, Multiplas_telas2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
