package com.company;

public abstract class Cartao {
    private int Id;
    private String Validade;
    private String Tipo;

    public Cartao(int id, String validade) {
        this.Id = id;
        this.Validade = validade;
    }

    public int getId() {
        return Id;
    }

    public String getValidade() {
        return Validade;
    }

    public abstract String getTipo();
}
