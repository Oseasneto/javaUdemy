package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce {

    public static void main(String[] args) {
        //o reduce transforma uma stream de dados em outra coisa diferente
        //o reduce sempre tem um acumulador

        //exemplo 1

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        //1ª maneira de fazer
        int total1 = nums.stream().reduce(soma).get();
        System.out.println(total1);
        //2ª maneira de fazer
        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(total2);
        //3ª maneira de fazer
        Integer total3 = nums.parallelStream().reduce(100, soma);
        System.out.println(total3);
        //4ª maneira utilizando filter
        nums.stream().filter(n-> n>5)
                .reduce(soma)
                //se estiver presente ele vai imprimir
                .ifPresent(System.out::println);

        //EXEMPLO 2

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a-> a.nota>=7;
        Function<Aluno, Double> nota = a-> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a+b;

        alunos.stream()
                .filter(aprovado)
                .map(nota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

    }
}
