package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        //criando uma referência do método imprimir
        Consumer<String> print = System.out::println;
        //dessa maneira posso chamar a função imprimir chamando apenas o print

        System.out.println("Criando uma stream: ");
        Stream<String> linguagens = Stream.of("Java", "Javascript", "Cobol");
        linguagens.forEach(print);

        System.out.println("Outra maneira de criar uma stream");
        String[] maisLinguagens = {"Python", "Lisp", "Perl", "Go"};

        Stream.of(maisLinguagens).forEach(print);
        Arrays.stream(maisLinguagens).forEach(print);
        Arrays.stream(maisLinguagens, 1,3).forEach(print);

        System.out.println("Criando stream a parti das collections");
        List<String> outrasLinguagens = Arrays.asList("C", "PHP", "Kotlin");
        outrasLinguagens.stream().forEach(print);


    }
}
