package com.company;

public class Carteira {
    private int idCarteira;
    private int senhaAcesso;
    private Cartao cartaoCredito;
    private  Cartao cartaoDebito;
    private String nomeCateira;
    private float saldo;

    public Carteira(int idCarteira, int senhaAcesso, Cartao cartaoCredito, String nomeCateira, float saldo) {
        this.idCarteira = idCarteira;
        this.senhaAcesso = senhaAcesso;
        this.cartaoCredito = cartaoCredito;
        this.nomeCateira = nomeCateira;
        this.saldo = saldo;
    }

    public Carteira(int idCarteira, int senhaAcesso, Cartao cartaoCredito, Cartao cartaoDebito, String nomeCateira, float saldo) {
        this.idCarteira = idCarteira;
        this.senhaAcesso = senhaAcesso;
        this.cartaoCredito = cartaoCredito;
        this.cartaoDebito = cartaoDebito;
        this.nomeCateira = nomeCateira;
        this.saldo = saldo;
    }

    public  int getIdCarteira() {
        return idCarteira;
    }

    public Cartao getCartaoCredito() {
        return cartaoCredito;
    }

    public Cartao getCartaoDebito() {
        return cartaoDebito;
    }

    public String getNomeCateira() {
        return nomeCateira;
    }

    public int getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setCartaoCredito(Cartao cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public void setCartaoDebito(Cartao cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }

    public void depositar(double valorParaDepositar){
        saldo += valorParaDepositar;
    }
    public void sacar(double valorParaSacar){
        saldo -= valorParaSacar;
    }

    public void transferirDinheiro(double valor, Carteira beneficiado, int senhaCorreta){
        senhaCorreta =123;
        if(senhaCorreta==this.senhaAcesso) {
            sacar(valor);
            beneficiado.depositar(valor);
            System.out.println("Pagamento efetuado!\n");
        }else{
            System.out.println("SENHA INCORRETA!\n");
        }
    }

    public String exibirCarteira(){
        return "Nome da Carteira: "+ this.nomeCateira+"\nId carteira: "+ this.idCarteira+"\nSenha Acesso: "+this.senhaAcesso+ "\nSaldo:"+ this.saldo;
    }
}
