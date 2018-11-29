package com.lourdinas.finalaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    private String memoria;
    private String operacao;
    private double valor1 = 0;
    private double valor2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btn_ponto = (Button) findViewById(R.id.btn_ponto);
        final Button btn_soma = (Button) findViewById(R.id.btn_mais);
        final Button btn_igual = (Button) findViewById(R.id.btn_igual);
        final Button btn_subtra = (Button) findViewById(R.id.btn_menos);
        final Button btn_div = (Button) findViewById(R.id.btn_divisao);
        final Button btn_del = (Button) findViewById(R.id.btn_del);
        final Button btn_mult = (Button) findViewById(R.id.btn_multi);
        final TextView txt_resultado = (TextView) findViewById(R.id.display_Resultado);
        final TextView txt_conta = (TextView) findViewById(R.id.display_Conta);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "9");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = (String) txt_conta.getText();
                txt_conta.setText(memoria + "9");
            }
        });

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoria = "";
                txt_conta.setText("");
                txt_resultado.setText("");
            }
        });
        btn_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "+";
                valor1 = Double.parseDouble(txt_conta.getText().toString());
                txt_resultado.setText(txt_conta.getText().toString() + "+");
                txt_conta.setText("");
            }
        });

        btn_subtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "-";
                valor1 = Double.parseDouble(txt_conta.getText().toString());
                txt_resultado.setText(txt_conta.getText().toString() + "-");
                txt_conta.setText("");
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "/";
                valor1 = Double.parseDouble(txt_conta.getText().toString());
                txt_resultado.setText(txt_conta.getText().toString() + "/");
                txt_conta.setText("");
            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "*";
                valor1 = Double.parseDouble(txt_conta.getText().toString());
                txt_resultado.setText(txt_conta.getText().toString() + "*");
                txt_conta.setText("");
            }
        });

        btn_ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "*";
                valor1 = Double.parseDouble(txt_conta.getText().toString());
                txt_resultado.setText(txt_conta.getText().toString() + ".");
                txt_conta.setText("");
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_conta.getText().equals("")){
                    Toast.makeText(getApplicationContext(), "Digite Um Numero", Toast.LENGTH_LONG).show();
                }else{
                    valor2 = Double.parseDouble(txt_conta.getText().toString());
                    txt_conta.setText("");
                    txt_resultado.setText(calcular(valor1,valor2, operacao));
                }
            }});
    }

    public String calcular(Double valor1 , Double valor2, String operacao){
        Double resultado =  0.0 ;

        if(operacao.equals("+")){
            resultado =  valor1 + valor2;
        }else if(operacao.equals("-")){
            resultado = valor1 - valor2;

        }else if(operacao.equals("*")){
            resultado = valor1 * valor2;

        }else if(operacao.equals("/")){
            if(valor2 == 0){
                Toast.makeText(getApplicationContext(),
                        "Não é possivel dividir por 0", Toast.LENGTH_LONG).show();
            }else{
                resultado = valor1 / valor2;
            }
        }
        return resultado.toString();
    }

}

