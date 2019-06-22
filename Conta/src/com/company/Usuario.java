package com.company;

public class Usuario {
    private String nome;
    private int idade;
    private Conta conta;
    private static int NumeroDeUsuarios;

    public Usuario(String nome, int idade, Conta conta) {
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
        NumeroDeUsuarios = NumeroDeUsuarios + 1;
    }

    public static int getNumeroDeUsuarios() {
        return NumeroDeUsuarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getConta() {
        return conta.getId();
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }


}

