package com.company;

public class CartaoTestDrive {
    public static void main(String[] args) {
        Cartao cartaoDebito1 =  new CartaoDebito(001,"23/09/2021");
        Cartao cartaoCredito1 = new CartaoCredito(001,"01/02/2022");
        System.out.println(cartaoCredito1.getTipo());
        System.out.println(cartaoDebito1.getTipo());

    }
}
