package com.company;

import auxiliar_database.SingletonJogosDAO;
import model.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private Scanner scanner;
    private List<Jogo> jogos;
    public Aplicacao(){
        scanner = new Scanner(System.in);
        jogos = new ArrayList<>();
    }
    public void mainLoop(){
        int op;
        while(true){
            menu();
            op = scanner.nextInt();
            if(op == 0)
                break;
            else
                avaliarOp(op);
        }
    }

    private void avaliarOp(int op) {
        String nome, genero, plataforma, lancamento;
        switch (op){
            //Buscar todos
            case 1:
                jogos = SingletonJogosDAO.getInstance().getAllJogo();
                for (Jogo jogo : jogos){
                    System.out.println(jogo);
                }
                break;
            case 2:

                System.out.println("Informe nome, genero, plataforma e lancamento:");
                nome = scanner.next();
                genero = scanner.next();
                plataforma = scanner.next();
                lancamento = scanner.next();
                Jogo game = new Jogo(nome, genero, plataforma,lancamento);
                SingletonJogosDAO.getInstance().insertJogo(game);
                break;
            case 3:
                System.out.println("Informe um nome:");
                nome = scanner.next();
                jogos = SingletonJogosDAO.getInstance().getAllJogoByName(nome);
                for (Jogo jogo : jogos){
                    System.out.println(jogo);
                }
                break;
            case 4:
                System.out.println("Informe um genero:");
                genero = scanner.next();
                jogos = SingletonJogosDAO.getInstance().getAllJogoByType(genero);
                for (Jogo jogo : jogos){
                    System.out.println(jogo);
                }
                break;
            case 5:
                System.out.println("Informe uma plataforma:");
                plataforma = scanner.next();
                jogos = SingletonJogosDAO.getInstance().getAllJogoByPlataform(plataforma);
                for (Jogo jogo : jogos){
                    System.out.println(jogo);
                }
                break;
            case 6:
                System.out.println("Informar o nome:");
                nome = scanner.next();
                jogos = SingletonJogosDAO.getInstance().getAllJogoByName(nome);
                if(jogos == null)
                    System.out.println("Jogo não cadastrado");
                else{
                    game = jogos.get(0);
                    System.out.println("Nome [" + game.nome+"]:");
                    game.nome = scanner.next();
                    System.out.println("Nome [" + game.genero+"]:");
                    game.genero = scanner.next();
                    System.out.println("Nome [" + game.plataforma+"]:");
                    game.plataforma = scanner.next();
                    SingletonJogosDAO.getInstance().updateJogo(game);
                }
                break;
            case 7:
                int id;
                System.out.println("Id para deletar:");
                id = scanner.nextInt();
                SingletonJogosDAO.getInstance().deleteById(id);
                break;

        }
    }

    private void menu(){
        System.out.println("1 - Exibir todos");
        System.out.println("2 - Cadastrar Jogo");
        System.out.println("3 - Buscar por nome");
        System.out.println("4 - Buscar por genero");
        System.out.println("5 - Buscar por plataforma");
        System.out.println("6 - Atualizar Jogo");
        System.out.println("7 - Deletar um Jogo");
        System.out.println("0 - Sair");
    }

}
