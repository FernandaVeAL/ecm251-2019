package com.company;
public class Carrinho extends ListaAbstrata {
    public Carrinho(){
        super();
    }
    @Override
    public  int getRestantes(){
        if (produtos.size() == 12)
            return 0;
        else
            return 12-produtos.size();
    }
    @Override
    public boolean adicionarALista(Produto produto) {
        if ((produto == null) || (produtos.size() == 12))
            return false;
        else {
            produtos.add(produto);
            return true;
        }
    }
}
