package com.example.graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonBarras;
    private Button buttonLinhas;
    private Button buttonPizza;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBarras = findViewById(R.id.buttonBarras);
        buttonLinhas = findViewById(R.id.buttonLinhas);
        buttonPizza = findViewById(R.id.buttonPizza);

        buttonBarras.setOnClickListener(this);
        buttonLinhas.setOnClickListener(this);
        buttonPizza.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonBarras){
            this.abrirTelaBarras();
        } else if (view.getId() == R.id.buttonLinhas){
            this.abrirTelaLinhas();
        } else if (view.getId() == R.id.buttonPizza){
            this.abrirTelaPizza();
        }
    }

    public void abrirTelaBarras(){
        Intent telaGraficoBarras = new Intent(this, GraficoBarrasActivity.class);
        startActivity(telaGraficoBarras);

        finish();
    }

    public void abrirTelaLinhas(){
        Intent telaGraficoLinhas = new Intent(this, GraficoLinhasActivity.class);
        startActivity(telaGraficoLinhas);

        finish();
    }
    public void abrirTelaPizza(){
        Intent telaGraficoPizza = new Intent(this, GraficoPizzaActivity.class);
        startActivity(telaGraficoPizza);

        finish();
    }
}