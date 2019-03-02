package com.example.gabri.lojadelivrosvirtual;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    // Variáveis para manipulação da View
    Button btOk;
    CheckBox cbCSharp, cbAndroid, cbJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associação das variáveis criadas acima com os componentes gráficos
        btOk = (Button) findViewById(R.id.btComprar);
        cbCSharp = (CheckBox) findViewById(R.id.cbCSharp);
        cbAndroid = (CheckBox) findViewById(R.id.cbAndroid);
        cbJava = (CheckBox) findViewById(R.id.cbJava);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem;

                if(!cbCSharp.isChecked() && !cbAndroid.isChecked() && !cbJava.isChecked()){
                    mensagem = "Você não selecionou nenhum item!\n\n";
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setMessage(mensagem);
                    alert.show();
                    return;
                }
                mensagem = "Você comprou os seguintes itens:\n\n";

                if(cbCSharp.isChecked()){
                    mensagem = mensagem + "CSharp\n";
                }
                if(cbAndroid.isChecked()){
                    mensagem = mensagem + "Android\n";
                }
                if (cbJava.isChecked()){
                    mensagem = mensagem + "Java\n";
                }

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setMessage(mensagem);
                alert.show();
            }
        });




    }
}
