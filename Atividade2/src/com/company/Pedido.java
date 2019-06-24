package com.company;

public class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;
    public Pedido(Cliente cliente, Carrinho carrinho){
        this.cliente = cliente;
        this.carrinho = carrinho;
    }
    public String resumoPedido(){
        return carrinho.retornarResumo();

    }

}
