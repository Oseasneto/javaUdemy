package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final   List<Aluno> alunos = new ArrayList<>();
    Curso(String nome){
        this.nome = nome;
    }

    //criando um método para adicionar aluno

    void adicionarAluno(Aluno aluno){

        this.alunos.add(aluno);// aqui adicionamos o aluno na lista

        aluno.cursos.add(this); // aqui acessamos a lista de cursos do aluno atual lá na classe Aluno
        // e adicionamos this que é o objeto atual de Curso.

        //Então quando adicionamos um aluno em alunos na classe Curso,
        // também adicionamos um curso  em cursos do aluno em questão.
    }

}
