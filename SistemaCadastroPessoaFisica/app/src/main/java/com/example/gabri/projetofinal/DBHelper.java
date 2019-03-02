package com.example.gabri.projetofinal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import java.util.ArrayList;
import java.util.List;

// Classe para manipulação do BD
public class DBHelper {

    // Variáveis para instanciação e controle do BD
    private static final String DATABASE_NAME = "bancodedados.db";
    private static final int DATABASE_VERSION =  1;
    private static final String TABLE_NAME = "Cadastro";

    private Context context;
    private SQLiteDatabase db;
    private SQLiteStatement insertStmt;

    // Comando para inserção dos dados
    private static final String INSERT = "insert into " + TABLE_NAME + " (nome, cpf, telefone, email, idade) values (?, ?, ?, ?, ?)";

    // Método para manipular o BD
    public DBHelper (Context context){
        this.context = context;
        OpenHelper openHelper = new OpenHelper(this.context);
        this.db = openHelper.getWritableDatabase();
        this.insertStmt = this.db.compileStatement(INSERT);
    }

    // Insere os dados no DB
    public long insert(String nome, String cpf, String telefone, String idade, String email){
        this.insertStmt.bindString(1, nome);
        this.insertStmt.bindString(2, cpf);
        this.insertStmt.bindString(3, idade);
        this.insertStmt.bindString(4, telefone);
        this.insertStmt.bindString(5, email);

        return this.insertStmt.executeInsert();
    }

    // Deleta as informações do DB
    public void deleteAll(){
        this.db.delete(TABLE_NAME, null, null);
    }

    // Cria uma lista de registros a partir dos dados inseridos no BD
    public List<Cadastro> queryGetAll(){
        List<Cadastro> list = new ArrayList<Cadastro>();

        // Try-Catch responsável por tratar erros na execução e exibição da lista de registros
        try {
            // Cursor: posiciona o cursor na próxima posição da tabela para inserção dos dados
            Cursor cursor = this.db.query(TABLE_NAME, new String[]{"nome", "cpf", "idade", "telefone", "email"},
                    null, null, null, null, null, null);

            // Conta a quantidade de registros inseridos
            int numRegistros = cursor.getCount();
            if (numRegistros != 0){
                cursor.moveToFirst();

                // Cadastra um registro em uma nova posição
                do {
                    Cadastro cadastro = new Cadastro(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
                    list.add(cadastro);
                }while (cursor.moveToNext());

                // Fecha o cursor e retorna a lista de registros
                if (cursor != null && !cursor.isClosed()){
                    cursor.close();
                    return list;
                }

            // Caso não haja nenhum registro na lista, retorna nulo
            }else{
                return null;
            }

        }catch (Exception err ){
            return null;
        }
        return list;
    }

    // Classe OpenHelper para instanciar o BD
    private static class OpenHelper extends SQLiteOpenHelper{
     OpenHelper(Context context){
         super(context, DATABASE_NAME, null, DATABASE_VERSION);
     }

     // Método que cria uma nova tabela no BD
     public void onCreate(SQLiteDatabase db){
         String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, cpf TEXT, idade TEXT, telefone TEXT, email TEXT);";
         db.execSQL(sql);
     }

     // Método que atualiza a tabela do BD
     public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
         db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
         onCreate(db);
     }
    }
}
