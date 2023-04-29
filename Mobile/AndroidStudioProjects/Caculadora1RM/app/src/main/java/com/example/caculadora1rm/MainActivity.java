package com.example.caculadora1rm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editQtdDolar;
    private EditText editCotacao;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editQtdDolar    = findViewById(R.id.editQtdDolar);
        editCotacao     = findViewById(R.id.editCotacao);
        textResultado   = findViewById(R.id.textResultado);
    }

    public void converter(View view) {

        double quantidadeDolar = Double.parseDouble(editQtdDolar.getText().toString());
        double cotacaoDolar = Double.parseDouble(editCotacao.getText().toString());
        double resultado = quantidadeDolar * cotacaoDolar;

        textResultado.setText("Valor covertido em R$: " + resultado);
    }
}