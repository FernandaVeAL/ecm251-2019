package model;

import utilities.Constants;

public class Jogo {
    public int id;
    public String nome, genero, plataforma, lancamento;

    public Jogo(String nome, String genero, String plataforma, String lancamento){
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.lancamento = lancamento;
        this.id = Constants.ID_NULO;
    }
    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", lancamento='" + lancamento + '\'' +
                '}';
    }
}