package com.example.gabri.minhaprimeiraapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Declarando variaveis para associar aos elementos da view
    EditText etNum1, etNum2, etRes;
    Button btSomar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associando campos de texto da view com variávieis de manipulação
        etNum1 = (EditText)findViewById(R.id.etNumero1);
        etNum2 = (EditText)findViewById(R.id.etNumero2);
        etRes = (EditText)findViewById(R.id.etResultado);

        // Associando o botão da view com a variavel de manipulação
        btSomar = (Button)findViewById(R.id.btnSomar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1, n2, result;

                n1 = Float.parseFloat(etNum1.getText().toString());
                n2 = Float.parseFloat(etNum2.getText().toString());

                result = n1 + n2;

                String strRes = String.valueOf(result);

                etRes.setText(strRes);

                AlertDialog.Builder caixaTexto = new AlertDialog.Builder(MainActivity.this);
                caixaTexto.setMessage("Soma efetuada!");
                caixaTexto.show();
            }
        });
    }
}
