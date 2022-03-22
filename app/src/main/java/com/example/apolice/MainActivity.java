package com.example.apolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    private EditText nome, idade, apolice, valorVeiculo;
    private RadioButton masculino, feminino;
    private TextView ValorApolice;
    private Object RadioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botaoCalcularSeguro = findViewById(R.id.buttonCalcularSeguro);


        botaoCalcularSeguro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome = findViewById(R.id.editTextNome);
                idade = findViewById(R.id.editTextIdade);
                apolice = findViewById(R.id.editTextApolice);
                valorVeiculo = findViewById(R.id.editTextValorVeiculo);
                masculino = findViewById(R.id.radioMasculino);
                feminino = findViewById(R.id.radioFeminino);
                ValorApolice = findViewById(R.id.textViewResultadoApolice);
/*
                if (nome.isEmpity() || editTextIdade.isEmpity() || editTextApolice.isEmpity() || editTextvalorVeiculo.isEmpity()) {

                    Snackbar.make(v, "preencha os campos com dados", Snackbar.LENGTH_SHORT).show();
                } else {
*/
                    Apolice ap = new Apolice(Integer.parseInt(apolice.getText().toString()), Integer.parseInt(idade.getText().toString()), nome.getText().toString(), RadioButtonSelecionado(), Double.parseDouble(valorVeiculo.getText().toString()));
                    double resultado = ap.CalculaApolice();
                    ValorApolice.setText("R$: " + resultado);
                //}
            }
        });


    }
    private char RadioButtonSelecionado(){
        if (feminino.isChecked()){
            return 'F';

        }else if (masculino.isChecked()){

            return 'M';

        }
        return 0;
    }


}