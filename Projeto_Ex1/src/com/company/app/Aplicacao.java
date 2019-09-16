package com.company.app;

import com.company.model.AnimaisDAO;
import com.company.model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private Scanner scanner;
    private List<Animal> animais;
    private Animal animal;
    public Aplicacao(){
        animais = new ArrayList<>();
    }
    public void run(){
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        do{
            menu();
            int op = scanner.nextInt();
            Animal resultAnimal;
            switch (op){
                case 0:
                    continuar = false;
                    break;
                case 1:
                    int id;
                    String nome,tipo;
                    Double lat,lon,altura,peso;
                    Animal animal = new Animal();
                    System.out.println("Informe:");
                    animal.nome = scanner.next();
                    animal.tipo = scanner.next();
                    animal.lat = scanner.nextDouble();
                    animal.lon = scanner.nextDouble();
                    animal.altura = scanner.nextDouble();
                    animal.peso = scanner.nextDouble();
                    AnimaisDAO.getInstance().insertAnimal(animal);
                    break;
                case 2:
                    animais =AnimaisDAO.getInstance().getAll();
                    for(Animal a : animais ){
                        System.out.println("ID:"+a.getId());
                        System.out.println(" Nome:" +a.nome);
                        System.out.println(" Tipo:" +a.tipo);
                        System.out.println(" Latitude:" +a.lat);
                        System.out.println(" Longitude:" +a.lon);
                        System.out.println(" Altura:" +a.altura);
                        System.out.println(" Peso" +a.peso);
                    }
                 break;
                case 3:
                    System.out.println("Informe o Nome:");
                    nome = scanner.next();
                    resultAnimal = AnimaisDAO.getInstance().getAnimal(nome);
                    if( resultAnimal == null )
                        System.out.println("Animal não cadastrado");
                    else{
                        System.out.print("ID: " + resultAnimal.getId());
                        System.out.print(" Nome: " + resultAnimal .nome);
                        System.out.println(" Tipo: " + resultAnimal.tipo);
                        System.out.print("Latitude: " +  resultAnimal.lat);
                        System.out.print(" Longitude: " +  resultAnimal.lon);
                        System.out.println(" Altura: " +  resultAnimal.altura);
                        System.out.println(" Peso: " +  resultAnimal.peso);
                    }
                 break;
                case 4:
                    System.out.println("Informe o Nome:");
                    nome = scanner.next();
                    resultAnimal = AnimaisDAO.getInstance().getAnimal(nome);
                    if( resultAnimal == null )
                        System.out.println("Animal não cadastrado");
                    else{
                        System.out.print("ID: " + resultAnimal.getId());
                        System.out.print(" Nome: " + resultAnimal .nome);
                        System.out.println(" Tipo: " + resultAnimal.tipo);
                        System.out.print("Latitude: " +  resultAnimal.lat);
                        System.out.print(" Longitude: " +  resultAnimal.lon);
                        System.out.println(" Altura: " +  resultAnimal.altura);
                        System.out.println(" Peso: " +  resultAnimal.peso);
                        System.out.println("Qual campo atualizar:");
                    }
            }

        }while(continuar);
    }
    public void menu(){
        System.out.println("1 - Inserir Animal");
        System.out.println("2 - Mostrar todos os animais");
        System.out.println("3 - Buscar Animal");
        System.out.println("4 - Atualizar animais");
        System.out.println("5 - Remover animal");
        System.out.printf("0 - Sair");
    }
}
