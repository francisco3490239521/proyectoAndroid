package com.example.comfm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Declaro las variables para cada widget
    private Button btnPersonas;
    private Button btnProdutos;
    private Button btnOrdenes;
    private Button btnInformes;
    private Button btnConfiguracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindUI();
        eventos();
    }


    //Metodo que ayuda a crear el enlace entre layout y codigo java
    private void bindUI(){
        btnPersonas = findViewById(R.id.btnPersonas);
        btnProdutos = findViewById(R.id.btnProductos);
        btnOrdenes = findViewById(R.id.btnOrdenes);
        btnInformes = findViewById(R.id.btnInformes);
        btnConfiguracion = findViewById(R.id.btnConfiguracion);
    }


    private void eventos(){
        btnPersonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, PersonasActivity.class);
                startActivity(intent);
            }
        });

        btnProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, ProductosActivity.class);
                startActivity(intent);
            }
        });

        btnOrdenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OrdenesActivity.class);
                startActivity(intent);
            }
        });

        btnInformes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InformesActivity.class);
                startActivity(intent);
            }
        });

        btnConfiguracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConfiguracionesActivity.class);
                startActivity(intent);
            }
        });
    }
}