package com.company;

public class UsuarioTestDrive {
    public static void main(String[] args) {
        Conta c1 = new Conta(001,20000.0);
        Usuario u1 = new Usuario("Fernanda",20,c1);
        System.out.println("Número de Usuários:" + Usuario.getNumeroDeUsuarios());
        System.out.println("Número de Contas:" + Conta.getNumeroDeContas());
        System.out.println("Nome usuário: " + u1.getNome());
        System.out.println("Conta: " + u1.getConta());
    }
}
