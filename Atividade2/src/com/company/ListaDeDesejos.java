package com.company;
public class ListaDeDesejos extends ListaAbstrata {
    public ListaDeDesejos(){
        super();
    }
    @Override
    public  int getRestantes(){
        if (produtos.size() == 5)
            return 0;
        else
            return 5-produtos.size();
    }
    @Override
    public boolean adicionarALista(Produto produto) {
        if ((produto == null) || (produtos.size() == 5))
            return false;
        else {
            produtos.add(produto);
            return true;
        }
    }
}
