package com.company;

public class Usuario {
    private String nome;
    private String email;
    private String cpf;
    private String nascimento;
    private Carteira carteira;
    private int logado = 0;


    public Usuario(String nome, String email, String cpf, String nascimento, Carteira carteira) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.carteira=carteira;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void entrarCarteira(int senhaDigitada){
        if(senhaDigitada==carteira.getSenhaAcesso()){
            this.logado=1;
            System.out.println("Acesso PERMITIDO!");
        }else{
            System.out.println("Acesso NEGADO!");
        }
    }

    public String exibirUsuario(){
        return "Nome: "+ this.nome+"\ne-mail: "+ this.email+"\ncpf: "+ this.cpf+ "\nnascimento: "+ this.nascimento;
    }
}
