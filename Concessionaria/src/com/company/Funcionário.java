package com.company;

public class Funcionário {
    private int QuantidadeDeVendas;
    private double PorcentagemDeComissão;
    private double SalárioBase;
    private String nome;
    private double SalárioDoMês;


    public Funcionário( String nome, double SalárioBase){
        this.nome = nome;
        this.PorcentagemDeComissão = 0.05;
        this.SalárioBase = SalárioBase;
    }
public double getSalárioDoMês(double totalDeVendas) {
        return this.PorcentagemDeComissão *totalDeVendas
            + this.SalárioBase;
}
public double getSalárioBase(){
        return this.SalárioBase;
}
public double getComissão(double totalDeVendas){
        return this.PorcentagemDeComissão * totalDeVendas;
}
}



