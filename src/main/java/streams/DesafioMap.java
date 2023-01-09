package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Interger.toBinaryString retorna a representação binária do inteiro especificado no formato de string.
       nums.stream().map(n -> Integer.toBinaryString(n))
               .forEach(System.out::println);

        //utilizando as funções lambdas
        Function <Integer, String> intParaBinary = n -> Integer.toBinaryString(n);
        UnaryOperator<String> reverter = n -> new StringBuilder(n).reverse().toString();

        // colocando o segundo parâmetro como 2 em Integer.parseInt(n, 2), ele entende que vc está
        //passando uma String binaria e quer tranformar ela para inteiro.
        Function<String, Integer> binaryParaInt = n -> Integer.parseInt(n, 2);

        nums.stream()
                .map(intParaBinary)
                .map(reverter)
                .map(binaryParaInt)
                .forEach(System.out::println);

    }
}
