package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produtos p1 = new Produtos("Caneta", 10, 0.25, 0);
        Produtos p2 = new Produtos("Caderno", 37.50, 0.40, 0);
        Produtos p3 = new Produtos("Notebook", 3423.56, 0.32, 100);
        Produtos p4 = new Produtos("Celular", 1567, 0.50, 0);
        Produtos p5 = new Produtos("Lapis", 5.34, 0.10, 5);

        List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produtos> desconto = p -> p.desconto>= 0.3;
        Predicate<Produtos> frete = p-> p.frete == 0;
        Function<Produtos, String> superDesconto = p-> p.nome + " Está com um super desconto!!!";

        produtos.stream()
                .filter(desconto)
                .filter(frete)
                .map(superDesconto)
                .forEach(System.out::println);

    }
}
