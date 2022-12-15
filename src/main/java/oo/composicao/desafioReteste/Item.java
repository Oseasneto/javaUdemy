package oo.composicao.desafioReteste;

public class Item {
    int quantidadeDeItens;
    Produto produto;

    Item(Produto produto, int quantidadeDeItens){
        this.produto = produto;
        this.quantidadeDeItens = quantidadeDeItens;
    }

}
