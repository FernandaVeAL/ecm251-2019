package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCartoes {
    private List<Cartao> cartoes;

    public ListaDeCartoes() {
        cartoes = new ArrayList<Cartao>();

    }
    public void addCartao(Cartao cartao){
        cartoes.add(cartao);
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }
    public void VisualizarCartoes(){
        String texto;
        for (Cartao i: cartoes) {
            return i.getId();
        }
    }
}