package com.company;

public class GerenteDeVendas {
    private int QuantidadeDeVendas;
    private double PorcentagemDeComissão;
    private double SalárioBase;
    private String nome;
    private double SalárioDoMês;


    public GerenteDeVendas( String nome, double SalárioBase){
        this.nome = nome;
        this.PorcentagemDeComissão = 0.10;
        this.SalárioBase = SalárioBase;
    }
    public double getSalárioDoMês(double totalDeVendas) {
        return getComissão(totalDeVendas)
                + this.SalárioBase;
    }
    public double getSalárioBase(){
        return this.SalárioBase;
    }
    public double getComissão(double totalDeVendas){
        return this.PorcentagemDeComissão * totalDeVendas + 0.5*this.SalárioBase;
    }
    public boolean aumentarSalariaBaseVendedor(Vendedor vendedor){
        if(vendedor.getGerente() .equals( this )) {
            return true;
        }
        else{

        return false;
        }
    }
}