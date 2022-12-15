package oo.composicao.desafioReteste;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Oseas");
        Cliente cliente2 = new Cliente("Mari");

        Compra compra1 = new Compra();
        compra1.adicionarItens("Caneta", 5,1.50);
        compra1.adicionarItens("Caderno", 2, 12.50);

        Compra compra2 = new Compra();
        compra2.adicionarItens("Lapis", 4, 1);
        compra2.adicionarItens("Tesoura", 3, 3.20);
        compra2.adicionarItens("Tinta", 4, 5);

        cliente1.compralista.add(compra1);
        cliente2.compralista.add(compra2);

        System.out.println(cliente1.valorTotalDeTodasAsCompras());
        System.out.println(cliente2.valorTotalDeTodasAsCompras());

    }
}
