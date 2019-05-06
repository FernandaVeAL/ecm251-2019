package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SistemaLogin {
    private List<Usuario> listaUsuarios ;
    public SistemaLogin(){
        listaUsuarios = new LinkedList<>();
    }
    public void Monitorar(){
        Scanner scanner = new Scanner((System.in));
        while (true){
            ExibirMenu();
            int op = scanner.nextInt();
            AvaliarEscolha(op);

        }
    }
    public void ExibirMenu(){
        System.out.println("1 - Logar");
        System.out.println("2 - Novo Usuário");
        System.out.println("3 - Usuários Cadastrados");
        System.out.println("4 - Trocar Senha");
        System.out.println("5 - Logar");
        System.out.println("0 - Sair");
    }
    private void AvaliarEscolha(int op){
        switch (op){
            case 0:
                System.exit(0); break;
            case 2: CadastrarUsuario(); break;
            case 3: ExibirListaDeUsuarios(); break;

            case 5: Logar(); break;
                default:
                    System.out.println("Sera implementado em versões futuras"); break;
        }
    }

    Autenticar void Logar() {

    }

    private void ExibirListaDeUsuarios() {
        System.out.println("Usuários cadastrados:");
        for (Usuario user : listaUsuarios){
            System.out.println(user.getNome() + "-" + user.getEmail());
        }
    }

    private void CadastrarUsuario() {
        System.out.println("Informe um nome, e-mail e senha ");
        Scanner scanner = new Scanner(System.in);
        String nome, email, senha;
        nome = scanner.next();
        email = scanner.next();
        senha = scanner.next();
        listaUsuarios.add(new Player(nome,email,senha));
        System.out.println("Cadastro");
    }
}
