package com.company;

public class CartaoDebito extends Cartao {
    public CartaoDebito(int id, String validade ) {
        super(id, validade);
    }
    @Override
    public String getTipo(){
        return "Cartão de Débito";
    }
}
