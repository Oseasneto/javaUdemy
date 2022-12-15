package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        //ultimo a entrar é o primeiro a sair

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Don quixote");
        livros.push("O hobbit");

        System.out.println(livros.peek());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
    }
}
