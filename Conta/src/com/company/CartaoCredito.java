package com.company;

public class CartaoCredito extends Cartao  {
    private int ccv;
    public CartaoCredito (int id, String validade) {
        super(id,validade);
        this.ccv = ccv;
    }
    @Override
    public String getTipo(){
        return "Cartão de Crédito";
    }
}