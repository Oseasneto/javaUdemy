package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 9.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a-> a.nota>=7;

        //utiliza-se o match para verificar uma condição para todos os dados da stream
        //nesse exemplo estamos verificando se todos os alunos foram aprovados

        System.out.println(alunos.stream().allMatch(aprovado));

        //algum aluno foi aprovado??
        System.out.println(alunos.stream().anyMatch(aprovado));

        //nenhum aluno foi aprovado?
        System.out.println(alunos.stream().noneMatch(aprovado));

    }
}
