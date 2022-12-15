package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
    int quant;
    //o item tem um produto, chamando a classe
    Produto produto;

    //o item recebe um produto e uma quantidade
    Item(Produto produto, int quant){
        this.produto = produto;
        this.quant = quant;
    }




}
