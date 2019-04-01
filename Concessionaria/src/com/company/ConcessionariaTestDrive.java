package com.company;

public class ConcessionariaTestDrive {
    public static void main(String[] args) {
        GerenteDeVendas g1 = new GerenteDeVendas("Carlos 2",6500);
        Vendedor v1 = new Vendedor("João",1000,g1);


        double totalVendasMes = 10000;

        System.out.println("Vendedor:");
        System.out.println("Comissâo:" + v1.getComissão(totalVendasMes));
        System.out.println("Gerente:");
        System.out.println("Gerente:" + g1.getComissão(totalVendasMes));
        if(g1.aumentarSalariaBaseVendedor(v1)) {
            System.out.println("Pode dar aumento!");
        } else {
            System.out.println("Sem aumento");
        }
    }
}
