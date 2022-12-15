package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //modos diferentes de adicionar na fila
        //offer - retorna falso quando a fila tá cheia
        //add - retorna um erro quando a fila tá cheia
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // peek retorna null se a fila tá vazia
        //element retorna uma erro (exceção) se a fila tá vazia
        System.out.println(fila.peek()); //pega o primeiro da fila sem remover
        fila.element(); //pega o primero da fila sem remover

        //fila.size(); tamanho da fila
        //fila.clear(); limpar fila
        //fila.isEmpty(); a fila está vazia?
        //fila.contains(); a fila contem?

        // poll retorna null quando a fila tá vazia
        // remove retorna uma exceção quando tá vazia
        System.out.println(fila.poll()); //pega o primeiro da fila e remove
        System.out.println(fila.remove()); //pega o elemento e remove

    }
}
