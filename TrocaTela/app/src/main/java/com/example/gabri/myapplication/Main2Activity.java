package com.example.gabri.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btVoltar = (Button) findViewById(R.id.btVoltar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarPrimeiraTela();
            }
        });
    }

    void voltarPrimeiraTela(){
        Intent intent = new Intent();
        intent.setClass(Main2Activity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
