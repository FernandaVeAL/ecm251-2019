package com.company;

public class  FuncionárioTestDrive {
    public static void main(String[] args) {
        Funcionário f1 = new Funcionário("Carlos",100);
        System.out.println("Salário Mes " + f1.getSalárioDoMês(1000));
    }
}
