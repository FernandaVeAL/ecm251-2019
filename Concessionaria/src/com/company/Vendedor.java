package com.company;

public class Vendedor {
    private int QuantidadeDeVendas;
    private double PorcentagemDeComissão;
    private double SalárioBase;
    private String nome;
    private GerenteDeVendas gerente;
    private double SalárioDoMês;


    public Vendedor(String nome, double SalárioBase,GerenteDeVendas gerente) {
        this.nome = nome;
        this.PorcentagemDeComissão = 0.05;
        this.SalárioBase = SalárioBase;
        this.gerente = gerente;

    }

    public double getSalárioDoMês(double totalDeVendas) {
        return this.PorcentagemDeComissão * totalDeVendas
                + this.SalárioBase;
    }
    public double getSalárioBase(){
        return this.SalárioBase;
    }
    public double getComissão(double totalDeVendas){
        return this.PorcentagemDeComissão * totalDeVendas;
    }

    public GerenteDeVendas getGerente() {
        return gerente;
    }
}
