package com.example.gabri.projetofinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

// Classe para a criação da tela de cadastro
public class TelaCadastro extends AppCompatActivity {

    // Variáveis para manipulação da View (BD, campos de texto e botões)
    private DBHelper dh;
    EditText etNome, etCPF, etIdade, etTelefone, etEmail;
    Button btInserirDados;
    Button btListar;
    Button btVoltar;

    // Cria a tela (Activity) de cadastro
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        // Instância do DB
        this.dh = new DBHelper(this);

        // Criação dos campos de texto
        etNome = (EditText) findViewById(R.id.etNome);
        etCPF = (EditText) findViewById(R.id.etCPF);
        etIdade = (EditText) findViewById(R.id.etIdade);
        etTelefone = (EditText) findViewById(R.id.etTelefone);
        etEmail = (EditText) findViewById(R.id.etEmail);

        // Criação dos botões
        btInserirDados = (Button) findViewById(R.id.btInserirDados);
        btListar = (Button) findViewById(R.id.btListar);
        btVoltar = (Button) findViewById(R.id.btVoltar);

        // Métodos para manipulação dos botões;
        // Botão Inserir
        btInserirDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inserção dos dados dos campos de texto no BD e exibição de mensagem de sucesso na operação
                if (etNome.getText().length() > 0 && etCPF.getText().length() > 0 && etIdade.getText().length() > 0 && etTelefone.getText().length() > 0 && etEmail.getText().length() > 0){
                    dh.insert(etNome.getText().toString(), etCPF.getText().toString(), etIdade.getText().toString(), etTelefone.getText().toString(), etEmail.getText().toString());
                    AlertDialog.Builder adb = new AlertDialog.Builder(TelaCadastro.this);
                    adb.setTitle("Sucesso!");
                    adb.setMessage("Dados Cadastrados");
                    adb.show();

                    // Limpa os campos de texto após a inserção
                    etNome.setText("");
                    etCPF.setText("");
                    etIdade.setText("");
                    etTelefone.setText("");
                    etEmail.setText("");
                }else {
                    // Exibe mensagem de erro caso os campos não sejam preenchidos
                    AlertDialog.Builder adb = new AlertDialog.Builder(TelaCadastro.this);
                    adb.setTitle("Erro!");
                    adb.setMessage("Todos os campos devem ser preenchidos");
                    adb.show();

                    // Limpa os campos de texto para uma nova inserção de dados
                    etNome.setText("");
                    etCPF.setText("");
                    etIdade.setText("");
                    etTelefone.setText("");
                    etEmail.setText("");
                }
            }
        });

        // Botão Listar
        btListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria uma lista a partir dos dados já registrados no BD
                List<Cadastro> cadastros = dh.queryGetAll();

                // Exibe uma mensagem caso a lista de registros esteja vazia
                if (cadastros == null){
                    AlertDialog.Builder adb = new AlertDialog.Builder(TelaCadastro.this);
                    adb.setTitle("Mensagem");
                    adb.setMessage("Não há registros cadastrados!");
                    adb.show();

                    return;
                }else {
                    // Caso a lista não esteja vazia, percorre o BD e lista os registros encontrados
                     for (int i = 0; i< cadastros.size(); i++){
                         Cadastro cadastro = (Cadastro) cadastros.get(i);

                         AlertDialog.Builder adb = new AlertDialog.Builder(TelaCadastro.this);
                         adb.setTitle("Registro " + (i+1));
                         adb.setMessage(
                                 "Nome: " + cadastro.getNome()
                                 + "\nCPF: " + cadastro.getCpf()
                                 + "\nIdade: " + cadastro.getIdade()
                                 + "\nTelefone: " + cadastro.getTelefone()
                                 + "\nEmail: " + cadastro.getEmail());
                         adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                             }
                         });
                         adb.show();
                     }
                }
            }
        });

     // Botão Voltar
     btVoltar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             voltar();
         }

         void voltar(){
             Intent intent = new Intent();
             intent.setClass(TelaCadastro.this, TelaInicio.class);
             startActivity(intent);
             finish();
         }
     });



    }
}
