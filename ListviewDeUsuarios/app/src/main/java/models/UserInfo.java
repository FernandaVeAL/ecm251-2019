package models;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private int id;
    private String Marca;
    private String Modelo;
    private String Ano;
    private String Localizacao;
    private String Distancia;


    public UserInfo(int id,String Marca, String Modelo, String Ano, String Localizacao, String Distancia) {
        this.id = getid();
        this.Marca = getMarca();
        this.Modelo = getModelo();
        this.Ano = getAno();
        this.Localizacao = getLocalizacao();
        this.Distancia = getDistancia();
    }


    public int getid() {
        return id;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getAno() {
        return Ano;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public String getDistancia() {
        return Distancia;
    }
}
