package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //cliente tem uma lista de compras
    String nome;
    List<Compra> listaCompra = new ArrayList<>();

    Cliente (String nome){
        this.nome = nome;
    }
    double obterValorTotal(){
        double total = 0;

        for (Compra compra:listaCompra) {
             total += compra.obterValorTotal();
        }
        return total;
    }


}
