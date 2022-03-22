package com.example.apolice;

import android.widget.EditText;

public class Apolice {
    private int numeroApolice, idade;
    private String nome;
    private char sexo;
    private double valorAutomovel;


    public Apolice(int numeroApolice,int idade, String nome, char sexo, double valorAutomovel) {
        this.numeroApolice = numeroApolice;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public double CalculaApolice() {

        if (sexo == 'M' && idade <= 25)
            return valorAutomovel * 10 / 100;
        if (sexo == 'M' && idade > 25)
            return valorAutomovel * 5 / 100;
        if (sexo == 'F')
            return valorAutomovel * 2 / 100;
        return 0;
    }


    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
