package com.company;

public class Player extends Usuario{
    public Player(String nome, String email, String senha){
        super(nome, email,senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals(this.senha);
    }
}
