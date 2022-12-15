package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;
public class Compra {
    //a compra tem uma lista de itens
    List<Item> itens = new ArrayList<>();

    //adicionando itens na lista de compras
    void adicionarItem(String nome, double preco, int qtde){
        this.itens.add(new Item(new Produto(nome, preco), qtde));
    }

    //criando um método para valor total
    double obterValorTotal(){
        double total = 0;
        for (Item item :itens) {
            total += item.quant* item.produto.preco;
        }
        return total;
    }

}
