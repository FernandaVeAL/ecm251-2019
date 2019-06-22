package com.company;

import java.util.List;

public class Conta {
    private int Id;
    private double Saldo;
    private ListaDeCartoes listaDeCartoes;
    private static int NumeroDeContas = 0;

public Conta( int Id, double Saldo){
    this.Id = Id;
    this.Saldo = Saldo;
    NumeroDeContas = NumeroDeContas +1;
    }

    public int getId() {
        return Id;
    }

    public double getSaldo() {
        return Saldo;
    }

    public static int getNumeroDeContas() {
        return NumeroDeContas ;
    }
    public void addCartaoNaListaDeCartoes(Cartao cartao){
         listaDeCartoes.addCartao(cartao);
    }
    public List<Cartao> retornarCaroes(){
        return listaDeCartoes.getCartoes()
    }
}
