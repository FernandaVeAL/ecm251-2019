package com.company;

public class Cartao {
    private static float taxaDeConversaoDolar;
    private int idCartao;
    private static int ncartao;
    private String label;
    private String emissorDoCartao;
    private char tipo;
    private String dataEmissao;
    private String validade;
    private int ccv;
    private int senha;
    private int numeroCartao;
    private int numeroDaConta;

    public Cartao(String label, String emissorDoCartao, char tipo, String dataEmissao, String validade, int ccv, int senha, int numeroCartao, int numeroDaConta) {
        this.idCartao=Cartao.ncartao;
        ncartao++;
        this.label = label;
        this.emissorDoCartao = emissorDoCartao;
        this.tipo = tipo;
        this.dataEmissao = dataEmissao;
        this.validade = validade;
        this.ccv = ccv;
        this.senha = senha;
        this.numeroCartao = numeroCartao;
        this.numeroDaConta = numeroDaConta;
    }

    public static float getTaxaDeConversaoDolar() {
        return taxaDeConversaoDolar;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public String getLabel() {
        return label;
    }

    public String getEmissorDoCartao() {
        return emissorDoCartao;
    }

    public char getTipo() {
        return tipo;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getValidade() {
        return validade;
    }

    public int getCcv() {
        return ccv;
    }

    public int getSenha() {
        return senha;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String exibirCartao(){
        return "Taxa Real/Dolar: "+ this.taxaDeConversaoDolar+" Id cartao: "+ this.idCartao+" label: "+ this.label+ " Emissora:"+ this.emissorDoCartao+" Tipo: "+this.tipo+" ccv: "+this.ccv +" Senha: "+ this.senha+" numero cartao:" + this.numeroCartao +
                " numero da conta:" + this.numeroDaConta+"\n";
    }
}
