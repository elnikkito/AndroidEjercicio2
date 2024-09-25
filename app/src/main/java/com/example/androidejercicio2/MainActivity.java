package com.example.androidejercicio2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int contador,contador_2,contador_3,contador_4, contadorGeneral;
    TextView texto,texto1,texto2,texto3,texto4;
    Button reset,reset1,reset2,reset3,reset4,contador1,contador2,contador3,contador4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        contadorGeneral=contadorGeneral+contador;

        texto = findViewById(R.id.texto);
        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        texto3 = findViewById(R.id.texto3);
        texto4 = findViewById(R.id.texto4);
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);
        contador3 = findViewById(R.id.contador3);
        contador4 = findViewById(R.id.contador4);
        reset=findViewById(R.id.reset);
        reset1=findViewById(R.id.reset1);
        reset2=findViewById(R.id.reset2);
        reset3=findViewById(R.id.reset3);
        reset4=findViewById(R.id.reset4);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral=0;
                contador=0;
                contador_2=0;
                contador_3=0;
                contador_4=0;
                texto.setText(""+contadorGeneral);
                texto1.setText(""+contador);
                texto2.setText(""+contador_2);
                texto3.setText(""+contador_3);
                texto4.setText(""+contador_4);
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador=0;
                texto1.setText(""+contador);
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador_2=0;
                texto2.setText(""+contador_2);
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador_3=0;
                texto3.setText(""+contador_3);
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador_4=0;
                texto4.setText(""+contador_4);
            }
        });

        contador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                texto.setText(""+contadorGeneral);
                contador++;
                texto1.setText(""+contador);
            }
        });

        contador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                texto.setText(""+contadorGeneral);
                contador_2++;
                texto2.setText(""+contador_2);
            }
        });

        contador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                texto.setText(""+contadorGeneral);
                contador_3++;
                texto3.setText(""+contador_3);
            }
        });

        contador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGeneral++;
                texto.setText(""+contadorGeneral);
                contador_4++;
                texto4.setText(""+contador_4);
            }
        });
    }
}