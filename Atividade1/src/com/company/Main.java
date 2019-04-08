/*
Enricco Diniz Leite do Amaral   17.00165-0
Fernanda Veneroso 17.00112-9
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        //Criando Cartões
        Cartao ca1 = new Cartao("visa","itau",'D',"10/05/1998","13/05/2020",343,123,2163192,87427392);
        Cartao ca2 = new Cartao("visa","itau",'C',"10/05/1998","13/05/2020",343,123,2163192,87427392);
        Cartao ca3 = new Cartao("visa","itau",'D',"10/05/1998","13/05/2020",343,123,2163192,87427392);
        //Criando Carteiras
        Carteira carteira1 = new Carteira(0,123,ca1,"Pedro",10000);
        Carteira carteira2 = new Carteira(1,456,ca2,ca3,"Ronaldo",10000);
        //Criando Usuários
        Usuario c1= new Usuario("pedro","pedro@bobao.com","4503.5383.5.3","18/01/1998",carteira1);
        Usuario c2= new Usuario("Ronaldo","Ronaldo@bobao.com","3203.5383.5.3","17/01/1993",carteira2);
        //Exibição do Início
        System.out.println( c1.exibirUsuario());
        System.out.println( carteira1.exibirCarteira());
        System.out.println( ca1.exibirCartao());
        System.out.println( c2.exibirUsuario());
        System.out.println( carteira2.exibirCarteira());
        System.out.println( ca2.exibirCartao());
        System.out.println( ca3.exibirCartao());
        //Transferência 1
        c1.getCarteira().transferirDinheiro(300,c2.getCarteira(),123);
        //Situação Final 1
        System.out.println( c1.getCarteira().exibirCarteira());
        System.out.println(c2.getCarteira().exibirCarteira());

        //Transferência 2
        c2.getCarteira().transferirDinheiro(300,c1.getCarteira(),123);
        //Situação Final 2
        System.out.println( c1.getCarteira().exibirCarteira());
        System.out.println(c2.getCarteira().exibirCarteira());

    }
}
