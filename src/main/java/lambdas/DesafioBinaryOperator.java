package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.util.Locale.ENGLISH;

public class DesafioBinaryOperator {
    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        Function<Double, Double> precoReal =
                Produto -> p.preco * (1 - p.desconto);

        System.out.println(precoReal.apply(p.preco));

        Function<Double, Double> Imp =
            preco -> preco >= 2500 ? (preco * 0.085)+ preco : preco;

        System.out.println(Imp.apply(precoReal.apply(p.preco)));

        Function<Double, Double> Frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50 ;
        System.out.println(Frete.apply(Imp.apply(precoReal.apply(p.preco))));

        //PARA A FUNÇÃO FUNCIONAR TEVE QUE ADICIONAR O "locale.ENGLISH"

       UnaryOperator<Double> arredondar =
               preco -> Double.parseDouble(String.format(ENGLISH,"%.2f", preco));

       Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        String preco = precoReal.andThen(Imp)
                .andThen(Frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p.preco);

        System.out.println(preco);



    }
}
