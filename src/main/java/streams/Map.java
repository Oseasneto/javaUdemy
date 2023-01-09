package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        //o MAP pega uma stream de dados e gera outro stream de dados do mesmo tamanho
        //mudando pela regra que foi escolhida. (função de transformação)

        Consumer<String > print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
        marcas.stream().map(m-> m.toUpperCase()).forEach(print);

        //algumas funções lambdas que podemos utilizar

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n-> n + "!!!";

        System.out.println("\nUsando composição: ");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito).forEach(print);
    }
}
