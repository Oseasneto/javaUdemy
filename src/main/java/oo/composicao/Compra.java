package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    double obterValorTotal(){
        double total = 0;
        // total += é o mesmo que: "total = total + ..."
        for (Item item: itens) {
            total += item.quantidade* item.preco;
        }

        return total;
    }
}
