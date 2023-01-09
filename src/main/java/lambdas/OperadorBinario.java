package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        //lambda function utilizado operador binario para verificar média
        //essa função recebe dois valores de mesmo tipo e retorna um do mesmo tipo
        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2)/2;
        System.out.println(media.apply(9.8, 5.7));

        //usando outra que recebe dois valores e retorna outro que pode ser de outro tipo

        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1+n2)/2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(9.7, 4.1));

        //posso utilizar a composição para receber os parâmetros das minhas outras funções

        Function<Double, String> conceito =
                m -> m>= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.7, 4.1));

    }
}
