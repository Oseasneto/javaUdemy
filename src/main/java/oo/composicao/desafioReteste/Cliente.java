package oo.composicao.desafioReteste;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;

    List<Compra> compralista = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    double valorTotalDeTodasAsCompras(){
        double total = 0;
        for (Compra compra:compralista) {
            total += compra.valorTotaldaCompra();
        }
        return total;
    }
}
