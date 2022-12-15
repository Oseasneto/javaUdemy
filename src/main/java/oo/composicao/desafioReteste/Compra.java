package oo.composicao.desafioReteste;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    public void adicionarItens(String nome, int quantidadeDeItens, double preco){
        this.itens.add(new Item(new Produto(nome, preco), quantidadeDeItens));
    }

    public double valorTotaldaCompra(){
        double total = 0;
        for (Item itens:itens) {
            total += itens.quantidadeDeItens * itens.produto.preco;
        }
        return total;
    }

}
