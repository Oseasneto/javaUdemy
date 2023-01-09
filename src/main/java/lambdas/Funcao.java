package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        //essa função recebe um inteiro e retorna uma String

        Function<Integer, String> parImpar =
                numero -> numero % 2 == 0 ? "Par": "Impar";

        System.out.println(parImpar.apply(12));
    }
}
