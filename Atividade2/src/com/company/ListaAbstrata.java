package com.company;

import java.util.LinkedList;
import java.util.List;


public abstract class ListaAbstrata {
    protected List<Produto> produtos;

    public ListaAbstrata() {
        produtos = new LinkedList<Produto>();
    }

    public abstract boolean adicionarALista(Produto produto);

    public boolean removerUltimoDaLista() {
        if (produtos.size() == 0)
            return false;
        else {
            produtos.remove(produtos.size() - 1);
            return true;
        }
    }

    public abstract int getRestantes();



    public String retornarResumo() {
        String sTemp = "";

        for (int i = 0; i < this.produtos.size(); i++) {
            sTemp = sTemp + this.produtos.get(i).exibirInfos();
        }

        return sTemp;
    }
    public void limparLista(){
        produtos.clear();
    }

}