package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Oseas");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Maria");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        //pegando todos os alunos do curso 1
        for (Aluno aluno: curso1.alunos) {
            System.out.println("estou matriculado no curso " + curso1.nome);
            System.out.println(" e o meu nome é " + aluno.nome);
        }
        //pegando os cursos do aluno 1
        System.out.println("Meu nome é " + aluno1.nome + " estou matriculado em: ");
        for (Curso curso: aluno1.cursos){
            System.out.println(curso.nome);
        }

    }

}
