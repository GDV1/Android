//************************************************************
// Instituto Federal de São Paulo - Campus Sertãozinho
// Disciplina: M4DADM
// Programação de Computadore e Dispositivos Móveis
// Aluno: Gabriel Dias Vieira
//************************************************************

package com.example.gabri.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Classe para a tela inicial do App
public class TelaInicio extends AppCompatActivity {

    // Cria a tela (Activity) de início
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Cria os botões e os instância para manipulção da Activity
        Button btInserir;
        Button btSair;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);

        btInserir = (Button) findViewById(R.id.btInserir);
        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaCadastro();
            }
        });

        btSair = (Button) findViewById(R.id.btSair);
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sair();
            }
        });

    }

    // Função para troca de tela (Navegação entre Activities)
    void telaCadastro(){
        Intent intent = new Intent();
        intent.setClass(TelaInicio.this, TelaCadastro.class);
        startActivity(intent);
        finish();
    }

    // Função que fecha a aplicação quando o usuário aperta o botão 'SAIR' na tela
    void sair(){
        finish();
    }
}
