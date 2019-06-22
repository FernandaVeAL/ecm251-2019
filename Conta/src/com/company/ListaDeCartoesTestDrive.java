package com.company;

import java.util.ArrayList;
import java.util.List;
public class ListaDeCartoesTestDrive {
    public static void main(String[] args) {
        ListaDeCartoes listaDeCartoes1 = new ListaDeCartoes();
        CartaoCredito cartaoCredito1 = new CartaoCredito(001,"01/02/2022");
        CartaoDebito cartaoDebito1 = new CartaoDebito(001,"23/09/2021");
        listaDeCartoes1.addCartao(cartaoCredito1);
        listaDeCartoes1.addCartao(cartaoDebito1);
        listaDeCartoes1.VisualizarCartoes();
    }
}
