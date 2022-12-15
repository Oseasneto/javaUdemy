package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Oseas");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 10);
        compra1.adicionarItem("Notebook", 1897.88, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem("Impressora", 998.90, 1);

        cliente1.listaCompra.add(compra1);
        cliente1.listaCompra.add(compra2);

        System.out.println(cliente1.obterValorTotal());
        System.out.println(compra1.obterValorTotal());
    }
}
