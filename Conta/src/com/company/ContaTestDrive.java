package com.company;

public class ContaTestDrive {
    public static void main(String[] args) {
        Conta c1 = new Conta(001,1000.0);
        System.out.println("ID: " + c1.getId());
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Número de Contas : " + Conta.getNumeroDeContas());
        Cartao cartaoDebito = new CartaoDebito(001,"16/11/2020");
        c1.addCartaoNaListaDeCartoes(cartaoDebito);
    }
}
