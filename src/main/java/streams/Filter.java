package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        //ele filtra os dados a parti do criterio proposto

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        // o predicate recebe um argumento e retorna um boolean
        Predicate<Aluno> aprovado = a-> a.nota >= 7;

        alunos.stream()
                .filter(aprovado)
                .map(a -> "Parabéns " + a.nome + "! você foi aprovado!")
                .forEach(System.out::println);

    }
}
